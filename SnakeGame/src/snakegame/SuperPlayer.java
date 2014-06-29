/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;

public class SuperPlayer { 
public static void PlayersName(){ 
      
String name1; 
String name2;

Scanner PlayerName = new Scanner (System.in); 

System.out.print("Enter the name of the player 1: " ); 
name1 = PlayerName.nextLine(); 

System.out.println("==============:<  >:==============" ); 
System.out.println("Welcome "+ name1); 
System.out.println("==============:<  >:==============" ); 


System.out.print("Enter the name of the player 2: " ); 
name2 = PlayerName.nextLine(); 

System.out.println("==============:<  >:==============" ); 
System.out.println("Welcome "+ name2); 
System.out.println("==============:<  >:==============" ); 

} 
}