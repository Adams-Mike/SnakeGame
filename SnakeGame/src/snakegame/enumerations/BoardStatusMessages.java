/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.enumerations;

/**
 *
 * @author Michael
 */
public enum BoardStatusMessages {

    NEWGAME("Starting new Game"),
    NEWWINDOW("new window opened"),
    QUITTER("DONT QUIT"),
    ERROR("There has been some sort of error"),
    EXIT("Now exiting\nThis program."),
    MOVINGUP("Now Moving up"),
    MOVINGDOWN("Now Moving down"),
    MOVINGLEFT("Now Moving left"),
    MOVINGRIGHT("Now Moving right");

    String message;

    private BoardStatusMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void display() {
        System.out.println(this.message);
    }
}
