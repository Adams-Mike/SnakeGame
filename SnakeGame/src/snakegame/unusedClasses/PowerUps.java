/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame.unusedClasses;

/**
 *
 * @author Michael
 */
public class PowerUps {
    
    boolean invulnerability;
    double speedMod;
    int healMe;
    
    public void cheatMode(){
        System.out.println("You now have invulnerability\n");
        this.invulnerability = true;
    }
    
    public void superSpeed() {
        System.out.println("You now have super speed\n");
        this.speedMod = 4;
    }
    
    public void runPowerUps(){
        cheatMode();
        superSpeed();
    }
           
    
}
