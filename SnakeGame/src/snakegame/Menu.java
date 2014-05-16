/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Menu {
    
    String selection;
    
    String info = "Menu\n\n"
            + "Start New Game: N\n"
            + "High Scores: H\n"
            + "Quit: Q\n\n"
            + "Please make a selection: ";

    public Menu() {
        this.selection = " ";
    }
    
    public void printMenuInfo(){
        System.out.println(this.info);
    }
    
    public void getUserInput(){
        Scanner input = new Scanner(System.in);
        this.selection = input.next();
        
        String upperSelection = selection.toUpperCase();
        
        boolean correct;
        correct = true;
        
        while (correct) {
            switch (upperSelection){
                case "N":
                    System.out.println("This Should start a new game eventually\n");
                    correct = false;
                    break;
                case "H":
                    System.out.println("This Should show the high scores eventually\n");
                    correct = false;
                    break;
                case "Q":
                    System.out.println("This should quit eventually\n");
                    correct = false;
                    break;
                default:
                    System.out.println("Incorrect Selection.\n Try again.\n\n");
                    this.selection = input.next();
                    upperSelection = selection.toUpperCase();
                    break;
            }
        }
                       
    }
    
    public void displayMenu(){
        printMenuInfo();
        getUserInput();        
    }       
}
