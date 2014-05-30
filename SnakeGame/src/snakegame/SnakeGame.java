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

    String name;
    String instructions = "This is a game about a snake that is inside you. \n\n"
            + "You will be playing against a random computer foe.\n"
            + "The object of this game is to collect as many items as possible"
            + " and survive.\n"
            + "Use arrow keys or WASD to control the movement of the snake.\n"
            + "Try not to die, and collect as many points as you can.\n\n"
            + "GOOD LUCK!\n\n";

 
        
    public static void main(String[] args) {
        
        SnakeGame myGame = new SnakeGame();
        Arena myGame2 = new Arena();
        Menu myGame3 = new Menu();
        PowerUps myGame4 = new PowerUps();
        ScoreBoard myGame5 = new ScoreBoard();
        Snake myGame6 = new Snake();
        HelpMenuView myGame7 = new HelpMenuView();
        SnakeLengthView myGame8 = new SnakeLengthView();
        
        myGame.getName();
        myGame.displayHelp();
        myGame3.displayMenu();
        myGame2.printArena();
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
        System.out.println("Enter your name:  ");
        this.name = input.next();
                
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }

    void instructions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}