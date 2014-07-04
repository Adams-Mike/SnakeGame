/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import javax.swing.ImageIcon;

/**
 *
 * @author Michael
 */
public class ImportImages extends SnakeGame {
    
    public ImportImages(){
        
        ImageIcon s = new ImageIcon("scale.png");
        SnakeScale = s.getImage();
        
        ImageIcon h = new ImageIcon("head.png");
        SnakeHead = h.getImage();
        
        ImageIcon a = new ImageIcon("apple.png");
        Apple = a.getImage();
        
        ImageIcon g = new ImageIcon("grape.png");
        Grape = g.getImage();
        
        ImageIcon o = new ImageIcon("orange.png");
        Orange = o.getImage();
        
        ImageIcon t = new ImageIcon("title.png");
        Splash = t.getImage();
        
        ImageIcon i = new ImageIcon("snake.png");
        Icon = i.getImage();
        
    }
    
}
