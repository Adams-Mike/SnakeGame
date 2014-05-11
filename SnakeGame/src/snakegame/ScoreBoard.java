/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

/**
 *
 * @author Isail
 */
public class ScoreBoard {
    String Arena ="This is place for the arena:  [        ]";
    String ArenaSizes = "The player can choose the size of the Arena";
    
    public void printArena(){
        System.out.println(this.Arena);
        System.out.println(this.ArenaSizes);
    }
}