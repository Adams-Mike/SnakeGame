/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Michael
 */
public class BoardExceptions extends Exception {

    /**
     * Creates a new instance of <code>BoardExceptions</code> without detail
     * message.
     */
    public BoardExceptions() {
    }

    /**
     * Constructs an instance of <code>BoardExceptions</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public BoardExceptions(String msg) {
        super(msg);
    }

    public BoardExceptions(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BoardExceptions(Throwable cause) {
        super(cause);
    }
}
