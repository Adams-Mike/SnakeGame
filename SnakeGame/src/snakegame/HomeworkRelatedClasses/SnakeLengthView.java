/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.HomeworkRelatedClasses;

import java.util.Scanner;

/**
 *
 * @author Michael
 */
public class SnakeLengthView {
    int minLength = 3;
    int maxLength = 15;
    int length = minLength;

    public void snakeLength(){
        boolean correct = false;
        Scanner keyboard = new Scanner(System.in);
        this.length = keyboard.nextInt();
         while(!correct) {
            if (length > maxLength || length < minLength){
                System.out.println("Error, wrong input (3-15)");
                this.length = keyboard.nextInt();
                continue;
            }
            correct = true;
            System.out.println("Snake Length is: " +length);
         }
      }
}
