/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.menus;

import snakegame.interfaces.DisplayInfo;
import snakegame.interfaces.EnterInfo;



/**
 *
 * @author Michael
 */
public class SuperMenu implements DisplayInfo, EnterInfo{    
    
    static String selection;
    
    final static String info =
             "\n\t===================================="
            + "\n\t* Menu                            *" 
            + "\n\t*                                 *"
            + "\n\t* Start a New Game: N             *"  
            + "\n\t* High Scores: S                  *"
            + "\n\t* Quit: Q                         *"
            + "\n\t* Help: H                         *" 
            + "\n\t*                                 *"
            + "\n\t* Please make a selection:        *"
            + "\n\t==================================="
            + "\n";

    
    public void displayHelpBorder() {       
        System.out.println(
        "\t\n****************************************************************************************\n");
    }
    
    SuperMenu(){
        //Empty Constuctor
    }
    
        public void displayArenaHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Snake. It consist of a grid of "
                + "\n\tsome size. Players move the snake to make points and eat fruits. "
                + "\n\tThe default board is 10 X 10. \n");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to make more points than others "
                + "\n\tand to that each snake must make points and eat fruits as much as possible."
                + "\n\tEach player must to do it until your snake die or if you set a timer."
                + "\n\tboard. The first player to make more points win the game and the right to eat the lossing snake.\n"
                ); 
        displayHelpBorder();
    }
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer can make player if the main player decided,  "
                + "\n\tbut in can be hard some times to be it.\n"
                ); 
        displayHelpBorder();
    }
             
    public void displaySnakeHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe Snake start with the size of three 'blocks' and after you go trough the game "
                +"\n\tyou can change the 'skin' or the size when you get a certain level of points.\n"
                ); 
        displayHelpBorder();
    }
                 
    public void displayDifficultyHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tWhen the player set one difficulty to the game some changes happen, like: "
                + "\n\tSize of the Arena"
                + "\n\tAmount of enemies in the game"
                + "\n\tAmount of obstacules in the Arena"
                + "\n\tSize of the Snake\n"
                ); 
        displayHelpBorder();
    }
    
}