package snakegame;

import javax.swing.*;
import static snakegame.SnakeGame.title;
import static snakegame.SnakeGame.height;
import static snakegame.SnakeGame.width;

/**
 *
 * @author Michael
 */
public class SnakeWindow {
    
    SnakeWindow(){
        JFrame window = new JFrame(title);
        window.setSize(height, width);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
    
}
