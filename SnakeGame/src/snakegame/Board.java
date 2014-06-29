/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakegame;

import java.awt.BorderLayout;
import static java.awt.Color.black;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static snakegame.SnakeGame.COLS;
import static snakegame.SnakeGame.ROWS;

/**
 *
 * @author Michael
 */
public class Board extends JPanel{

  private final JPanel[][] board = new JPanel[COLS][ROWS];
  private final JPanel gameArea;

  public Board() {
    super();
    super.setLayout(new BorderLayout());

    gameArea = new JPanel();
    gameArea.setLayout(new GridLayout(COLS,ROWS));

    // Set up JPanels on bottom and right to display letters and numbers for the board
    // JPanels are called south and west
    super.add(gameArea, BorderLayout.CENTER);

    for (int i=0; i<COLS; i++) {
      for (int j=0; j<ROWS; j++) {
        // Set up the grid
        board[i][j] = new JPanel();
        board[i][j].setBackground(black);
        gameArea.add(board[i][j]);
      }
    }
    super.validate();
  }

    /**
     *
     */
    public void displaySnake() {

  }
}

