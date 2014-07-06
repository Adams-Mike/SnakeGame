/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import static snakegame.SnakeGame.score;


/**
 *
 * @author Michael
 */
public class GameBoard extends JPanel implements ActionListener{
      
private boolean up = false;
private boolean down = false;
private boolean left = false;
private boolean right = false;

private final int Width = 450;
private final int Height = 450;

private final int AllPositions = (Width * Height) / 100;

private final int PosX[] = new int[AllPositions];
private final int PosY[] = new int[AllPositions];

private int length = 4;

private final int Square = 25;

private boolean alive = true;

private final double grape_points = 1;
private final double apple_points= 2.5;
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

private Image Splash;
private Image Icon;

private Image GameOver;

private Timer timer;

private final int Step = 100;

private boolean GrapePlaced = false;
private boolean OrangePlaced = false;
private boolean ApplePlaced = false;

  
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
        int random = (int)(Math.random() * 30);
        AppleX = random * Square;
        
        if (AppleX == OrangeX || AppleX == GrapeX){
            random = (int)(Math.random() * 30);
            AppleX = random * Square;
        }
        
        random = (int)(Math.random() * 30);
        AppleY = random * Square;
        
        if (AppleY == OrangeY || AppleY == GrapeY){
            random = (int)(Math.random() * 30);
            AppleY = random * Square;
        }
        
        ApplePlaced = true;
      }
      
          private void placeGrape() {
        int random = (int)(Math.random() * 30);
        GrapeX = random * Square;
        
        if (GrapeX == OrangeX || GrapeX == GrapeX){
            random = (int)(Math.random() * 30);
            GrapeX = random * Square;
        }
        
        random = (int)(Math.random() * 30);
        GrapeY = random * Square;
        
        if (GrapeY == OrangeY || GrapeY == GrapeY){
            random = (int)(Math.random() * 30);
            GrapeY = random * Square;
        }
        
        GrapePlaced = true;
    }  
      
         private void placeOrange() {
          int random = (int)(Math.random() * 30);
          OrangeX = random * Square;
          
          if (OrangeX == OrangeX || OrangeX == GrapeX){
              random = (int)(Math.random() * 30);
              OrangeX = random * Square;
          }
          
          random = (int)(Math.random() * 30);
          OrangeY = random * Square;
          
          if (OrangeY == OrangeY || OrangeY == GrapeY){
              
              random = (int)(Math.random() * 30);
              OrangeY = random * Square;
          }
          
          OrangePlaced = true;
      }
         
         
  
  
  private void InitGame(){
        
        for (int i = 0; i < length; i++) {
            PosX[i] = 100 - i * 30;
            PosY[i] = 100;
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

        doDrawing(g);
    }
    
    private void doDrawing(Graphics g) {
        
        if (alive) {
            
            if (ApplePlaced){
                g.drawImage(Apple, AppleX, AppleY, this);
                //System.out.println("Apple Drawn!");
                repaint();
            }
            
            if (GrapePlaced){
                g.drawImage(Grape, GrapeX, GrapeY, this);
                //System.out.println("Grape Drawn!");
                repaint();
            }
            
            if (OrangePlaced){
                g.drawImage(Orange, OrangeX, OrangeY, this);
                //System.out.println("Orange Drawn!");
                repaint();
            }

            
            for (int i = 0; i < Square; i++) {
                if (i == 0) {
                    g.drawImage(SnakeHead, PosX[i], PosY[i], this);
                    repaint();
                } 
                else {
                    g.drawImage(SnakeScale, PosX[i], PosY[i], this);
                    repaint();
                }
            }

            Toolkit.getDefaultToolkit().sync();
            g.dispose();
            repaint();

        } else {

            //gameOver(g);
        }        
    }
    
    private void CheckFruit() {
            
            CheckApple();
            CheckOrange();
            CheckGrape(); 
            
            if (ApplePlaced && GrapePlaced && OrangePlaced){
                System.out.println("\n\tToo many fruit on board!\n");
            }
            else {
                System.out.println("\n\tFruit Placed!\n");
                PlaceFruit();
            }
        }
        
        private void CheckApple(){            
                if (PosX[0] == AppleX && PosY[0] == AppleY){
                    score += apple_points;
                    length += 2;
                    ApplePlaced = false;
                    System.out.println("\n\tCrunch!");
                }
        }
        
        private void CheckOrange(){
            if (PosX[0] == OrangeX && PosY[0] == OrangeY){
                score += orange_points;
                length += 3;
                OrangePlaced = false;
                System.out.println("\n\tChomp!");
            }
        }
        
        private void CheckGrape(){
            if (PosX[0] == GrapeX && PosY[0] == GrapeY){
                score += grape_points;
                length++;
                GrapePlaced = false;
                System.out.println("\n\tNibble!");
                
            }
        }

    /*@Override
    public void paint(Graphics g){
    this.repaint();
    }*/
    
    private void Bite() {
        for (int i = length; i > 0; i--){
            if (((i <= 4 && (PosX[0] == PosX[i]))
                    && PosY[0] == PosY[i])) {
                alive = false;
            }
        }
        
        if (PosX[0] > WIDTH){
            alive = false;
        }
        if (PosY[0] > HEIGHT){
            alive = false;
        }
        if (PosX[0] < 0){
            alive = false;
        }
        if (PosX[0] < 0){
            alive = false;
        }
        
        
        
            
    }

    private void MoveSnake() {
        for (int i = length; i > 0; i--) {
            PosX[i] = PosX[i - 1];
            PosY[i] = PosY[i - 1];
        }
        
        if (up){
            PosY[0] -= Square;
        }
        
        if (down){
            PosY[0] += Square;
        }
        
        if (left){
            PosX[0] -= Square;
        }
        
        if (right){
            PosX[0] += Square;
        }
    }

    private void gameOver(Graphics g) {
        g.drawImage(GameOver, Height / 2, Width /2, this);
    }

    private void ImportImages() {
        
        ImageIcon s = new ImageIcon("resources/body.png");
        SnakeScale = s.getImage();
        
        
        
        ImageIcon h = new ImageIcon("resources/head.png");
        SnakeHead = h.getImage();
        
        ImageIcon a = new ImageIcon("resources/apple.png");
        Apple = a.getImage();
        
        ImageIcon g = new ImageIcon("resources/grape.png");
        Grape = g.getImage();
        
        ImageIcon o = new ImageIcon("resources/orange.png");
        Orange = o.getImage();
        
        //ImageIcon t = new ImageIcon("resources/title.png");
        //Splash = t.getImage();
        
        //ImageIcon i = new ImageIcon("resources/snake.png");
        //Icon = i.getImage();
        
        //ImageIcon gg = new ImageIcon("resources/gameover.png");
        //GameOver = gg.getImage();
    }
  
    /*private class CheckFruit {
    
    public CheckFruit() {
    
    CheckApple();
    CheckOrange();
    CheckGrape();
    
    if (ApplePlaced && GrapePlaced && OrangePlaced){
    System.out.println("\n\tToo many fruit on board!\n");
    }
    else {
    System.out.println("\n\tFruit Placed!\n");
    PlaceFruit();
    }
    }
    
    private void CheckApple(){
    if (PosX[0] == AppleX && PosY[0] == AppleY){
    score += apple_points;
    length += 2;
    ApplePlaced = false;
    System.out.println("\n\tCrunch!");
    }
    }
    
    private void CheckOrange(){
    if (PosX[0] == OrangeX && PosY[0] == OrangeY){
    score += orange_points;
    length += 3;
    OrangePlaced = false;
    System.out.println("\n\tChomp!");
    }
    }
    
    private void CheckGrape(){
    if (PosX[0] == GrapeX && PosY[0] == GrapeY){
    score += grape_points;
    length++;
    GrapePlaced = false;
    System.out.println("\n\tNibble!");
    
    }
    }
    }*/
  
  private class Controls extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            
            switch(e.getKeyCode()){
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
                default:
                    break;
                    
            }
        }
        private void Up(){
            up = true;
            down = false;
            left = false;
            right = false;
            System.out.println("Now moving up!");
        }
        
        private void Down(){
            up = false;
            down = true;
            left = false;
            right = false;
            System.out.println("Now moving down!");
        }
        
        private void Left(){
            up = false;
            down = false;
            left = true;
            right = false;
            System.out.println("Now moving left!");
        }
        
        private void Right(){
            up = false;
            down = false;
            left = false;
            right = true;
            System.out.println("Now moving right!");
        }
  }
  
}

