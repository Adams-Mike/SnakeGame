/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;

import snakegame.GameBoard.GameBoard;
import Exceptions.MenuException;
import java.awt.EventQueue;
import java.util.Arrays;
import javax.swing.JFrame;

/**
 *
 *
 */
public class SnakeGame extends JFrame {

    /* UNNEEDED
     private void displayWelcome() {
     System.out.println(SnakeGame.WELCOME);
     }
     */
    String name;
    String instructions = "Type the word linked to the menu and "
            + "\nUse arrow keys or WASD to control the movement of the snake.\n";

    public static double score = 0;

    public SnakeGame() {
        add(new GameBoard());
        setTitle("SnakeGame");
        pack();

        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws MenuException {

        try {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    JFrame newFrame = new SnakeGame();
                    newFrame.setVisible(true);
                }
            });
        } catch (Throwable ex) {
            System.out.println("Unexpected Error: " + ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));

        }
    }
    /* SnakeGame myGame = new SnakeGame();
     Arena myGame2 = new Arena();
     Menu myGame3 = new Menu() {

     @Override
     public void displayHelpBoarder() {
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     };
     PowerUps myGame4 = new PowerUps();
     Score myGame5 = new Score();
     SnakeInfo myGame6 = new SnakeInfo();
     HelpMenuView myGame7 = new HelpMenuView() {

     @Override
     public void displayHelpBoarder() {
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     };
     SnakeLengthView myGame8 = new SnakeLengthView();
     SuperPlayer myGame9 = new SuperPlayer();
        
     //Board game1 = new Board();
        
     //SnakeWindow displayWindow = new SnakeWindow();
     //ImportImages import = new ImportImages();
        
        
     //myGame.displayWelcome();
     myGame.getName();
     myGame.displayName();
     SuperPlayer.PlayersName();
     myGame3.displayMenu();
     myGame5.difficultyLevel();
     myGame2.displayArena();
     myGame4.runPowerUps();
     myGame5.scoreCalculator();
     myGame5.highScores();
     myGame6.getSnakeName();
     myGame6.displaySnake();
     myGame6.getSnakeSize();
     myGame8.snakeLength();
    
     }     
     /*    public void getName(){
     Scanner input = new Scanner(System.in);
     System.out.println(this.instructions);
     System.out.println("Please enter your name:  ");
     this.name = input.next();
    
     }*/
//    }
//
//    public void displayName() {
//        System.out.println("\nWelcome " + this.name + "\n");
//
//    }
//
//    void instructions() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
