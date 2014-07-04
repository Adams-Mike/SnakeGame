/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.HomeworkRelatedClasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import snakegame.SnakeGame;
import static snakegame.SnakeGame.alive;

/**
 *
 * @author Michael
 */
public class Controls implements KeyListener, ActionListener{


    Controls(KeyEvent e){
        while(alive){
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
    
    protected void keyController(KeyEvent e){

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
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
