/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;


/**
 *
 * @author Michael
 */
public class Board extends JPanel implements ActionListener{

  
  public Board() {
      
      addKeyListener(new Controls());
      setBackground(Color.black);
      setFocusable(true);
      
      setPreferredSize(new Dimension(SnakeGame.Width, SnakeGame.Height - 16));
      
      InitGame init = new InitGame();
      
      
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (SnakeGame.alive) {
            CheckFruit check = new CheckFruit();
            checkCollision();
            moveSnake();
        }
        
        repaint();
        
    }

    private void checkCollision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSnake() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
  public class PlaceFruit {
      
      PlaceFruit() {
        
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
        SnakeGame.AppleX = random * SnakeGame.Square;
        
        if (SnakeGame.AppleX == SnakeGame.OrangeX || SnakeGame.AppleX == SnakeGame.GrapeX){
            random = (int)(Math.random() * 30);
            SnakeGame.AppleX = random * SnakeGame.Square;
        }
        
        random = (int)(Math.random() * 30);
        SnakeGame.AppleY = random * SnakeGame.Square;
        
        if (SnakeGame.AppleY == SnakeGame.OrangeY || SnakeGame.AppleY == SnakeGame.GrapeY){
            random = (int)(Math.random() * 30);
            SnakeGame.AppleY = random * SnakeGame.Square;
        }
        
        SnakeGame.ApplePlaced = true;
      }
      
      private void placeOrange() {
          int random = (int)(Math.random() * 30);
          SnakeGame.OrangeX = random * SnakeGame.Square;
          
          if (SnakeGame.OrangeX == SnakeGame.OrangeX || SnakeGame.OrangeX == SnakeGame.GrapeX){
              random = (int)(Math.random() * 30);
              SnakeGame.OrangeX = random * SnakeGame.Square;
          }
          
          random = (int)(Math.random() * 30);
          SnakeGame.OrangeY = random * SnakeGame.Square;
          
          if (SnakeGame.OrangeY == SnakeGame.OrangeY || SnakeGame.OrangeY == SnakeGame.GrapeY){
              
              random = (int)(Math.random() * 30);
              SnakeGame.OrangeY = random * SnakeGame.Square;
          }
          
          SnakeGame.OrangePlaced = true;
      }

    private void placeGrape() {
        int random = (int)(Math.random() * 30);
        SnakeGame.GrapeX = random * SnakeGame.Square;
        
        if (SnakeGame.GrapeX == SnakeGame.OrangeX || SnakeGame.GrapeX == SnakeGame.GrapeX){
            random = (int)(Math.random() * 30);
            SnakeGame.GrapeX = random * SnakeGame.Square;
        }
        
        random = (int)(Math.random() * 30);
        SnakeGame.GrapeY = random * SnakeGame.Square;
        
        if (SnakeGame.GrapeY == SnakeGame.OrangeY || SnakeGame.GrapeY == SnakeGame.GrapeY){
            random = (int)(Math.random() * 30);
            SnakeGame.GrapeY = random * SnakeGame.Square;
        }
        
        SnakeGame.GrapePlaced = true;
    }      
      
  }
  
  private class CheckFruit {

        public CheckFruit() {
            
            if (SnakeGame.ApplePlaced || SnakeGame.GrapePlaced || SnakeGame.OrangePlaced){
                System.out.println("Too many fruit on board!\n");
            }
            else {
                PlaceFruit placeFruit = new PlaceFruit();
            }
        }
  }
  
  private class Controls extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            
            switch(e.getKeyCode()){
                case KeyEvent.VK_UP:
                case KeyEvent.VK_W:
                    up();
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_S:
                    down();
                    break;
                case KeyEvent.VK_LEFT:
                case KeyEvent.VK_A:
                    left();
                    break;
                case KeyEvent.VK_RIGHT:
                case KeyEvent.VK_D:
                    right();
                    break;
                default:
                    break;
                    
            }
        }
    }
  
  private static void up(){
      SnakeGame.up = true;
      SnakeGame.down = false;
      SnakeGame.left = false;
      SnakeGame.right = false;
      System.out.println("Now moving up!");
  }
    
  private static void down(){
        SnakeGame.up = false;
        SnakeGame.down = true;
        SnakeGame.left = false;
        SnakeGame.right = false;
        System.out.println("Now moving down!");
  }
    
  private static void left(){
      SnakeGame.up = false;
      SnakeGame.down = false;
      SnakeGame.left = true;
      SnakeGame.right = false;
      System.out.println("Now moving left!");
  }
  
  private static void right(){
      SnakeGame.up = false;
      SnakeGame.down = false;
      SnakeGame.left = false;
      SnakeGame.right = true;
      System.out.println("Now moving right!");
  }
  
}

