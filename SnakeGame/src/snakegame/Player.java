/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.util.Scanner;

public class Player { 
public void PlayersName(){  
  
String name; 
 
Scanner PlayerName = new Scanner (System.in); 


for (int i = 0 ; i<2 ; i++){ 
System.out.print("Enter the name of the player "+(i+1)+": " ); 
name = PlayerName.nextLine(); 

System.out.println("==============:<  >:==============" ); 
System.out.println("Welcome "+ name); 
System.out.println("==============:<  >:==============" ); 

} 

System.out.println("All the names where entered correctly." ); 

} 
}