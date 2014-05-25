/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame;


/**
 *
 * @author jacksonrkj
 */
public class HelpMenuControl  {
    
    public static Menu menu = new Menu();
    
    public HelpMenuControl() {
        
    } 

    public void displayArenaHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Snake. It consist of a grid of "
                + "\n\tsome size. Players move the snake to make points and eat fruits. "
                + "\n\tThe default board is 10 X 10. ");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to make more points than others "
                + "\n\tand to that each snake must make points and eat fruits as much as possible."
                + "\n\tEach player must to do it until your snake die or if you set a timer."
                + "\n\tboard. The first player to make more points win the game and the right to eat the lossing snake."
                ); 
        displayHelpBorder();
    }
                   
    public void displayComputerPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tA computer can make player if the main player decided,  "
                + "\n\tbut in can be hard some times to be it."
                ); 
        displayHelpBorder();
    }
             
    public void displaySnakeHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe Snake start with the size of three 'blocks' and after you go trough the game "
                +"\n\tyou can change the 'skin' or the size when you get a certain level of points."
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
                + "\n\tSize of the Snake"
                ); 
        displayHelpBorder();
    }
    
    public void displayQuitHelp() {
        this.menu.displayMenu();
        this.menu.selection();
        
    }
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~:<      }}}}}}}}}}}}}}:<       ==========:<      ###########:<    OOOOOOOOO:<");
    }
    
  
}
