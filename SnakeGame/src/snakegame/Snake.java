/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;

/**
 *
 * @author Isail
 */
public class Snake{
    
    String snakeName;
    String displaySnake;
    public static void main(String[] args) {
        SnakeGame mySnake = new SnakeGame();
        mySnake.getName();
        }
        public void getSnakeName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Put a name to your Snake");
        this.snakeName = input.next();
        }
        public void displaySnake() {
        System.out.println("Your Snake name is: " + this.snakeName + "!!!!!\nSsssssuper cool");
        }
                
    }
    
  
