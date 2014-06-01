/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;

/**
 *
 *
 */
public class SnakeGame {

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

private void displayWelcome() {
        System.out.println(SnakeGame.WELCOME);
    }

    
    
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
        

        myGame.displayWelcome();
        myGame.getName();
        myGame.displayName();
        myGame3.displayMenu();
        myGame2.displayArena();
        myGame4.runPowerUps();
        myGame5.scoreCalculator();
        myGame5.highScores();
        myGame6.getSnakeName();
        myGame6.displaySnake();
        myGame6.getSnakeSize();
        myGame8.snakeLength();
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