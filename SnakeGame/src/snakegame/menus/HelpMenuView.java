/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.menus;

import java.util.Scanner;
import snakegame.unusedClasses.SnakeError;

public class HelpMenuView extends SuperMenu {
        
    private final static String[][] menuItems = {
        {"A", "Arena"},
        {"G", "Snake game"}, 
        {"C", "CPU Player"},
        {"S", "Snake"},
        {"D", "Difficulty"},       
        {"Q", "Quit Help"}        
    };
    
    
    // Create instance of the HelpMenuControl (action) class
    private final HelpMenuControl helpMenuControl = new HelpMenuControl();
    // default constructor
    public HelpMenuView() {
        super();
    } 
    

    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "A":
                    this.helpMenuControl.displayArenaHelp();
                    break;
                case "G":
                    this.helpMenuControl.displayGameHelp();
                    break;
                case "C":
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;                  
                case "S":
                    this.helpMenuControl.displaySnakeHelp();
                    break;
                case "D":
                    this.helpMenuControl.displayDifficultyHelp();
                    break;
                case "Q": 
                    break;
                default: 
                    new SnakeError().displayError("Invalid selection. Please select a valid command.");
            }
        } while (!command.contains("Q")); 
        
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tHelp Menu: \n\tEnter the letter associated with one of the following commands:");

        for (String[] menuItem : HelpMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}