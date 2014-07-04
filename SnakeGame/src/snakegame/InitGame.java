/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import javax.swing.Timer;



/**
 *
 * @author Michael
 */
public class InitGame extends Board{
    
    public InitGame(){
        
        for (int i = 0; i < SnakeGame.length; i++) {
            SnakeGame.PosX[i] = 50 - i * 10;
            SnakeGame.PosY[i] = 50;
        }
        
        Board.PlaceFruit fruit = new Board.PlaceFruit();
        
        SnakeGame.timer = new Timer(SnakeGame.Step, this);
        SnakeGame.timer.start();
        
    }
    
}
