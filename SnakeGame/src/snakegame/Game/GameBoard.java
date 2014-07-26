/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.Game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import snakegame.SnakeGame;
import static snakegame.SnakeGame.score;
import snakegame.enumerations.BoardStatusMessages;

/**
 *
 * @author Michael
 */
public class GameBoard extends JPanel implements ActionListener {

    private boolean up = false;
    private boolean down = false;
    private boolean left = false;
    private boolean right = false;

    private final int Width = 450;
    private final int Height = 450 + 16;

    private final int AllPositions = (Width * Height) / 18;

    private final int PosX[] = new int[AllPositions];
    private final int PosY[] = new int[AllPositions];

    private int length = 3;

    private final int Square = 25;

    private boolean alive = true;

    private final double grape_points = 1;
    private final double apple_points = 2.5;
    private final double orange_points = 5;

    private int AppleX = 0;
    private int AppleY = 0;

    private int OrangeX = 0;
    private int OrangeY = 0;

    private int GrapeX = 0;
    private int GrapeY = 0;

    private Image SnakeHead;
    private Image SnakeScale;

    private Image Apple;
    private Image Grape;
    private Image Orange;

    private Timer timer;

    long newTime = 0;
    long oldTime = 0;
    double fps = 0;
    int frames = 0;
    double timeCount = 0;
    private boolean showFPS = false;

    private int Step = 250;

    private boolean GrapePlaced = false;
    private boolean OrangePlaced = false;
    private boolean ApplePlaced = false;
    private boolean paused = false;

    private boolean showHelp = false;

    public GameBoard() {

        addKeyListener(new Controls());
        setBackground(Color.black);
        setFocusable(true);
        setPreferredSize(new Dimension(Width, Height));
        ImportImages();
        InitGame();
    }

    void PlaceFruit() {

        Random r = new Random();
        int random = r.nextInt((10 - 1) + 1) + 1;

        switch (random) {
            case 1:
                placeGrape();
                break;
            case 5:
                placeGrape();
                placeApple();
                break;
            case 10:
                placeGrape();
                placeApple();
                placeOrange();
                break;
            default:
                placeGrape();
                break;
        }
    }

    private void placeApple() {
        int random = (int) (Math.random() * 18);
        AppleX = random * Square;

        if (AppleX == OrangeX || AppleX == GrapeX) {
            random = (int) (Math.random() * 18);
            AppleX = random * Square;
        }

        random = (int) (Math.random() * 18);
        AppleY = random * Square;

        if (AppleY == OrangeY || AppleY == GrapeY) {
            random = (int) (Math.random() * 18);
            AppleY = random * Square;
        }

        ApplePlaced = true;
    }

    private void placeGrape() {
        int random = (int) (Math.random() * 18);
        GrapeX = random * Square;

        if (GrapeX == OrangeX || GrapeX == GrapeX) {
            random = (int) (Math.random() * 18);
            GrapeX = random * Square;
        }

        random = (int) (Math.random() * 18);
        GrapeY = random * Square;

        if (GrapeY == OrangeY || GrapeY == GrapeY) {
            random = (int) (Math.random() * 18);
            GrapeY = random * Square;
        }

        GrapePlaced = true;
    }

    private void placeOrange() {
        int random = (int) (Math.random() * 18);
        OrangeX = random * Square;

        if (OrangeX == OrangeX || OrangeX == GrapeX) {
            random = (int) (Math.random() * 18);
            OrangeX = random * Square;
        }

        random = (int) (Math.random() * 18);
        OrangeY = random * Square;

        if (OrangeY == OrangeY || OrangeY == GrapeY) {

            random = (int) (Math.random() * 18);
            OrangeY = random * Square;
        }

        OrangePlaced = true;
    }

    private void InitGame() {

        setBackground(Color.black);
        score = 0;
        length = 3;
        alive = true;
        for (int i = 0; i < length; i++) {
            PosX[i] = 225 + i * 25;
            PosY[i] = 225;
        }

        PlaceFruit();
        timer = new Timer(Step, this);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (alive) {
            CheckFruit();
            Bite();
            MoveSnake();
        }

        repaint();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        displayGraphics(g);
    }

    private void displayGraphics(Graphics g) {

        oldTime = System.currentTimeMillis();
        if (alive) {
            timer.start();
            if (ApplePlaced) {
                g.drawImage(Apple, AppleX, AppleY, this);
                //System.out.println("Apple Drawn!");
            }

            if (GrapePlaced) {
                g.drawImage(Grape, GrapeX, GrapeY, this);
                //System.out.println("Grape Drawn!");
            }

            if (OrangePlaced) {
                g.drawImage(Orange, OrangeX, OrangeY, this);
                //System.out.println("Orange Drawn!");
            }

            for (int i = 0; i < Square; i++) {
                if (i == 0) {
                    g.drawImage(SnakeHead, PosX[i], PosY[i], this);
                } else {
                    g.drawImage(SnakeScale, PosX[i], PosY[i], this);
                }
            }

            if (paused) {
                pause(g);
                timer.stop();
            }

            if (showFPS) {

                long diff = (oldTime - newTime);
                timeCount += diff;
                frames++;
                if (timeCount > 1000) {
                    timeCount = 0;
                    fps = frames;
                    frames = 0;
                }
                FPS(g);
            }

                help(g);

            stats(g);
            Toolkit.getDefaultToolkit().sync();
            g.dispose();
            newTime = System.currentTimeMillis();

        } else {
            gameOver(g);
        }

    }

    private void help(Graphics g) {

        String msg, msg1, msg2, msg3, msg4, msg5, msg6, msg7, msg8;

        Font small = new Font("SansSerif", Font.BOLD, 12);
        Font large = new Font("SansSerif", Font.BOLD, 14);

        g.setColor(Color.white);
        g.setFont(large);

        if (showHelp == false) {
            msg = "Show Menu: M";
            g.drawString(msg, 10, 135);
        } else {
            msg = "Menu:";
            msg1 = "Controls: WASD or Arrows";
            msg2 = "New Game: N\n";
            msg3 = "Hide Menu: M";
            msg4 = "Show FPS: F";
            msg5 = "Quit: ESC or Q";
            msg6 = "Faster: PG UP";
            msg7 = "Slower: PG DN";
            msg8 = "Pause: SPACE or P";

            g.drawString(msg, 10, 135);
            g.setFont(small);
            g.drawString(msg1, 10, 150);
            g.drawString(msg2, 10, 165);
            g.drawString(msg4, 10, 180);
            g.drawString(msg6, 10, 195);
            g.drawString(msg7, 10, 210);
            g.drawString(msg8, 10, 225);
            g.drawString(msg5, 10, 240);
            g.drawString(msg3, 10, 255);
        }
    }

    private void stats(Graphics g) {

        String msg = "Score: " + score;
        Font small = new Font("SansSerif", Font.BOLD, 12);
        FontMetrics metr = getFontMetrics(small);

        String speed = "";
        if (Step == 100) {
            speed = "Speed: LUDICROUS SPEED!";
        }
        if (Step == 150) {
            speed = "Speed: Fast";
        }
        if (Step == 200) {
            speed = "Speed: Medium";
        }
        if (Step == 250) {
            speed = "Speed: Slow";
        }
        if (Step > 250) {
            speed = "Speed: Molasses";
        }

        String SnakeLength = "Length: " + length;

        g.setColor(Color.red);
        g.setFont(small);
        g.drawString(SnakeLength, 10, Height - 15);
        g.drawString(speed, Width - metr.stringWidth(speed), Height);
        g.drawString(msg, 10, Height);
    }

    private void FPS(Graphics g) {

        String msg = "FPS: " + fps;
        Font small = new Font("SansSerif", Font.BOLD, 12);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.red);
        g.setFont(small);
        g.drawString(msg, Width - metr.stringWidth(msg), 15);
    }

    private void pause(Graphics g) {
        String msg = "Paused";
        Font small = new Font("SansSerif", Font.BOLD, 25);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (Width - metr.stringWidth(msg)) / 2, Height / 2);
    }

    private void gameOver(Graphics g) {

        String msg = "Game Over";
        String displayScore = "Score: " + score;
        Font small = new Font("SansSerif", Font.BOLD, 14);
        Font large = new Font("SansSerif", Font.BOLD, 25);
        FontMetrics largeMetr = getFontMetrics(large);
        FontMetrics smallMetr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(large);
        g.drawString(msg, (Width - largeMetr.stringWidth(msg)) / 2, Height / 2);
        g.setFont(small);
        g.drawString(displayScore, (Width - smallMetr.stringWidth(displayScore)) / 2, (Height / 2) + smallMetr.stringWidth(displayScore) / 2);

    }

    private void CheckFruit() {

        try {
            CheckApple();
            CheckOrange();
            CheckGrape();

        } catch (Throwable ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        if (!OrangePlaced && !ApplePlaced && !GrapePlaced) {
            //System.out.println("\n\tFruit Placed!\n");
            PlaceFruit();
        } else {
            //System.out.println("\n\tToo many fruit on board!\n");
        }
    }

    private void CheckApple() {
        if (ApplePlaced) {
            if (PosX[0] == AppleX && PosY[0] == AppleY) {
                SnakeGame.score += apple_points * length;
                length += 2;
                ApplePlaced = false;
                System.out.println("\n\tCrunch!");
            }
        }
    }

    private void CheckOrange() {
        if (OrangePlaced) {
            if (PosX[0] == OrangeX && PosY[0] == OrangeY) {
                score += orange_points * length;
                length += 3;
                OrangePlaced = false;
                System.out.println("\n\tChomp!");
            }
        }
    }

    private void CheckGrape() {
        if (GrapePlaced) {
            if (PosX[0] == GrapeX && PosY[0] == GrapeY) {
                score += grape_points * length;
                length++;
                GrapePlaced = false;
                System.out.println("\n\tNibble!");
            }
        }
    }

    private void Bite() {
        for (int i = length; i > 0; i--) {
            if ((PosY[0] == PosY[i]) && (i > 4) && (PosX[0] == PosX[i])) {
                alive = false;
            }
        }

        if (PosX[0] > Width) {
            alive = false;
        }
        if (PosY[0] > Height) {
            alive = false;
        }
        if (PosX[0] < 0) {
            alive = false;
        }
        if (PosX[0] < 0) {
            alive = false;
        }

    }

    private void MoveSnake() {
        for (int i = length; i > 0; i--) {
            PosX[i] = PosX[i - 1];
            PosY[i] = PosY[i - 1];
        }

        if (up) {
            PosY[0] -= Square;
        }

        if (down) {
            PosY[0] += Square;
        }

        if (left) {
            PosX[0] -= Square;
        }

        if (right) {
            PosX[0] += Square;
        }
    }

    private void ImportImages() {

        ImageIcon s = new ImageIcon("resources/body2.png");
        SnakeScale = s.getImage();

        ImageIcon h = new ImageIcon("resources/head.png");
        SnakeHead = h.getImage();

        ImageIcon a = new ImageIcon("resources/apple.png");
        Apple = a.getImage();

        ImageIcon g = new ImageIcon("resources/grape.png");
        Grape = g.getImage();

        ImageIcon o = new ImageIcon("resources/orange.png");
        Orange = o.getImage();

    }

    private void pauseGame() {
        paused = !paused;
        if (!paused) {
            timer.start();
        }
    }

    private void setHelp() {
        showHelp = !showHelp;
    }

    private void setFPS() {
        showFPS = !showFPS;
    }

    private void faster() {
        Step -= 50;
        timer.stop();
        timer.setDelay(Step);
        timer.start();
    }

    private void slower() {
        Step += 50;
        timer.stop();
        timer.setDelay(Step);
        timer.start();

    }

    private class Controls extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                case KeyEvent.VK_W:
                    Up();
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_S:
                    Down();
                    break;
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_A:
                    Left();
                    break;
                case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                    Right();
                    break;
                case KeyEvent.VK_N:
                    timer.stop();
                    InitGame();
                    break;
                case KeyEvent.VK_P:
                case KeyEvent.VK_SPACE:
                    pauseGame();
                    break;
                case KeyEvent.VK_ESCAPE:
                case KeyEvent.VK_Q:
                    System.exit(0);
                    break;
                case KeyEvent.VK_M:
                    setHelp();
                    break;
                case KeyEvent.VK_F:
                    setFPS();
                    break;
                case KeyEvent.VK_PAGE_DOWN:
                    slower();
                    break;
                case KeyEvent.VK_PAGE_UP:
                    faster();
                default:
                    break;
            }
        }

        private void Up() {
            up = true;
            down = false;
            left = false;
            right = false;
            BoardStatusMessages.MOVINGUP.display();
        }

        private void Down() {
            up = false;
            down = true;
            left = false;
            right = false;
            BoardStatusMessages.MOVINGDOWN.display();
        }

        private void Left() {
            up = false;
            down = false;
            left = true;
            right = false;
            BoardStatusMessages.MOVINGLEFT.display();
        }

        private void Right() {
            up = false;
            down = false;
            left = false;
            right = true;
            BoardStatusMessages.MOVINGRIGHT.display();
        }
    }

}
