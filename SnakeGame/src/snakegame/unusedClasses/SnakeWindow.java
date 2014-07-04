package snakegame.unusedClasses;

/*package snakegame

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import static snakegame.SnakeGame.TITLE;
import static snakegame.SnakeGame.height;
import static snakegame.SnakeGame.length;
import static snakegame.SnakeGame.score;
import static snakegame.SnakeGame.titleSmall;
import static snakegame.SnakeGame.width;
/**
* THIS NEEDS TO BE FIXED!
* @author Michael
*/



/*
public class SnakeWindow extends JFrame{
    
    
    SnakeWindow(){
        this.setFocusable(true);
        JFrame window = new JFrame(titleSmall);
        window.setSize(height, width);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        JLabel statusLabel = new JLabel("status");
        JLabel scoreLabel = new JLabel("Score: " + score);
        JLabel lengthLabel = new JLabel("Length: " + length);
        
        
        //set icon?
        //window.setIconImage(new ImageIcon("snake.png").getImage());
        window.setLayout(new BorderLayout());
        
        JPanel gameArea = new JPanel(){
            @Override public void setBorder(Border border) {
                // No!
            }
        };
        JTextArea gameBox = new JTextArea(25, 40){
            @Override public void setBorder(Border border) {
                // No!
            }
        };
        gameBox.setSize(new Dimension(width, height));
        gameBox.setEditable(true);
        
        window.add(gameArea, BorderLayout.NORTH);
        
        gameBox.setBackground(Color.BLACK);
        gameBox.setForeground(Color.GREEN);
        gameBox.setText(TITLE);
        
        
        JPanel statusBar = new JPanel();
        statusBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
        window.add(statusBar, BorderLayout.LINE_START);
        statusBar.setPreferredSize(new Dimension(width/3, 16));
        statusBar.setLayout(new BoxLayout(statusBar, BoxLayout.X_AXIS));
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        JPanel scoreBar = new JPanel();
        scoreBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
        window.add(scoreBar, BorderLayout.CENTER);
        scoreBar.setPreferredSize(new Dimension(width/3, 16));
        scoreBar.setLayout(new BoxLayout(scoreBar, BoxLayout.X_AXIS));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JPanel lengthBar = new JPanel();
        lengthBar.setBorder(new BevelBorder(BevelBorder.LOWERED));
        window.add(lengthBar, BorderLayout.LINE_END);
        lengthBar.setPreferredSize(new Dimension(width/3, 16));
        lengthBar.setLayout(new BoxLayout(lengthBar, BoxLayout.X_AXIS));
        scoreLabel.setHorizontalAlignment(SwingConstants.LEFT);
        
        
        statusBar.add(statusLabel);
        scoreBar.add(scoreLabel);
        lengthBar.add(lengthLabel);
        gameArea.add(gameBox);
        window.pack();
        
    }
    
}*/