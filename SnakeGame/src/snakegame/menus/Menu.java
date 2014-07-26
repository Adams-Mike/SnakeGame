/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.menus;

import Exceptions.MenuException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael
 */
public abstract class Menu extends SuperMenu {

    private final HelpMenuView helpMenuView = new HelpMenuView() {

        @Override
        public void displayHelpBoarder() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void doSomeStuff() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void showSomeInfo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public Menu() {
        Menu.selection = " ";
    }

    public void printMenuInfo() {
        System.out.println(Menu.info);
    }

    public void getUserInput() throws NumberFormatException, MenuException {
        Scanner input = new Scanner(System.in);
        Menu.selection = input.next();

        String upperSelection = selection.toUpperCase();

        boolean correct;
        correct = true;

        while (correct) {
            switch (upperSelection) {
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
                    Menu.selection = input.next();
                    upperSelection = selection.toUpperCase();
                    throw new MenuException("\"Incorrect Selection.\\n Try again.\\n\\n\"");
            }
        }

    }

    public void displayMenu() throws MenuException {
        printMenuInfo();
        try {
            getUserInput();
        } catch (NumberFormatException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void selection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
