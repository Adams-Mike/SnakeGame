/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.unusedClasses;

import java.util.Scanner;
import snakegame.SnakeGame;

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
        System.out.println("Your Snake name is: " + this.snakeName + "!!!!!");
        }
    /**
     * @author Isail
     */
        public void getSnakeSize(){
        int snakeLarge = 3;
        int growPoints = 1;
       
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Let's see how large is your snake \n");
        
        System.out.println("How many points did you collect?: ");
        int collectedPoints;
        collectedPoints = input.nextInt();
        
        System.out.println("How many bites did you get from your enemy?: ");
        int enemyBites;
        enemyBites = input.nextInt();
        
        
       int growSize = (collectedPoints * growPoints)+ snakeLarge;
       int finalSize = growSize-enemyBites;
       
       
       
        if (finalSize==4){
            System.out.println("The large of your snake is: ");
            System.out.print((double)finalSize);
            System.out.println("\nYou could make it better, try it again");
            
        }
        else if(finalSize<4&finalSize>2){
            System.out.println("The large of your snake is: ");
            System.out.print(finalSize);
            System.out.println("\nIt's better than nothing, try it again");
            
        }
        else if(finalSize>4){
            System.out.println("The large of your snake is: ");
            System.out.print(finalSize);
            System.out.println("\nGood job, show me that you are better");
            }
        else if(finalSize<2&&finalSize>1){
            System.out.println("Invalid large of Snake!!!");
            System.out.print(finalSize);
            System.out.println("\nThis is bad, you can't go like this, try again");
        }
        else{
            System.out.println("Invalid large of Snake ");
            System.out.print(finalSize);}
        }   
    }
    
  
