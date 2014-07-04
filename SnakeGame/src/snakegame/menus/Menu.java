/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.menus;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class Menu extends SuperMenu{
   
    private final HelpMenuView helpMenuView = new HelpMenuView();
    
    public Menu() {
        Menu.selection = " ";
    }
    
    public void printMenuInfo(){
        System.out.println(Menu.info);
    }
    
    public void getUserInput(){
        Scanner input = new Scanner(System.in);
        Menu.selection = input.next();
        
        String upperSelection = selection.toUpperCase();
        
        boolean correct;
        correct = true;
        
        while (correct) {
            switch (upperSelection){
                case "N":
                    System.out.println("This Should start a new game eventually\n");
                    correct = false;
                    break;
                case "S":
                    System.out.println("This Should show the high scores eventually\n");
                    correct = false;
                    break;
                case "Q":
                    System.out.println("This should quit eventually\n");
                    correct = false;
                    break;
                case "H":
                    this.helpMenuView.getInput();
                    break;    
                default:
                    System.out.println("Incorrect Selection.\n Try again.\n\n");
                    Menu.selection = input.next();
                    upperSelection = selection.toUpperCase();
                    break;
            }
        }
                       
    }
    
    public void displayMenu(){
        printMenuInfo();
        getUserInput();        
    }       

    void selection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
