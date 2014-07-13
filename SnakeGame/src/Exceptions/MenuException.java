/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exceptions;

/**
 *
 * @author emisud
 */
public class MenuException extends Exception {

    /**
     * Creates a new instance of <code>MenuException</code> without detail
     * message.
     */
    public MenuException() {
    }

    /**
     * Constructs an instance of <code>MenuException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MenuException(String msg) {
        super(msg);
    }
}
