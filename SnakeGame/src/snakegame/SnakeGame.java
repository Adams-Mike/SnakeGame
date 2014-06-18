/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 *
 */
public class SnakeGame {

/* NO LONGER NEEDED - REMOVE LATER
private final static String WELCOME = 
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Snake!                                       *"                            
            + "\n\t* You will be playing against the CPU and other rivals.               *"
            + "\n\t* The object of the game is to get as many points you can and don't   *"
            + "\n\t* die. Also eat the fruits to grow and be the winner                  *" 
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";
*/ //NO LONGER NEEDED - REMOVE LATER
    
public static boolean up = false;
public static boolean down = false;
public static boolean left = false;
public static boolean right = false;

public static final int arena_height = 30;
public static final int arena_width = 30;

public static final int width = 450;
public static final int height = 450;

public static double score = 0;
public static final int length_easy = 1;
public static final int length_hard = 5;

public static final double apple_points = 1;
public static final double grape_points = 1;
public static final double orange_points = 1;

public static final String title = "Snake";

/* UNNEEDED
private void displayWelcome() {
        System.out.println(SnakeGame.WELCOME);
    }
*/    
    String name;
    String instructions = "Type the word linked to the menu and "
            + "\nUse arrow keys or WASD to control the movement of the snake.\n";

    public static void main(String[] args) {
        
        SnakeGame myGame = new SnakeGame();
        Arena myGame2 = new Arena();
        Menu myGame3 = new Menu();
        PowerUps myGame4 = new PowerUps();
        ScoreBoard myGame5 = new ScoreBoard();
        Snake myGame6 = new Snake();
        HelpMenuView myGame7 = new HelpMenuView();
        SnakeLengthView myGame8 = new SnakeLengthView();
        Player myGame9 = new Player();
        
        SnakeWindow window = new SnakeWindow();

        //myGame.displayWelcome();
        //myGame.getName();
        //myGame.displayName();
        //myGame9.PlayersName();
        //myGame3.displayMenu();
        //myGame5.difficultyLevel();
        //myGame2.displayArena();
        //myGame4.runPowerUps();
        //myGame5.scoreCalculator();
        //myGame5.highScores();
        //myGame6.getSnakeName();
        //myGame6.displaySnake();
        //myGame6.getSnakeSize();
        //myGame8.snakeLength();
    }
    
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println(this.instructions);
        System.out.println("Please enter your name:  ");
        this.name = input.next();
                
    }
    
    public void displayName() {
        System.out.println("\nWelcome " + this.name + "\n");
       
    }
    
    void instructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}