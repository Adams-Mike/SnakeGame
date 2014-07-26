/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakegame.homework.isail;

import java.util.Scanner;

/**
 *
 * @author Isail
 */
public class Score {

    double orangePoints = 5.5;
    double applePoints = 10.5;
    double grapePoints = 2.5;

    double playerScore = 0;
    double playerScoreTwo = 0;

    public void difficultyLevel() {
        System.out.println("==============:<  >:==============");
        System.out.println("Choose a difficult level");
        String[] data = {"Babie Snake: 000:<", "Anaconda: OOOOOOO:<", "Python: DDDDDDDDDDDD:<"};
        System.out.println("==============:<  >:==============");
        Scanner input = new Scanner(System.in);
        int level;
        level = input.nextInt();
        System.out.println(level);

    }

    public void scoreCalculator() {

        Scanner input = new Scanner(System.in);

        System.out.println("Player 1: \n\n");

        System.out.println("How many oranges did you collect?: ");
        int collectedOranges;
        collectedOranges = input.nextInt();

        System.out.println("How many apples did you collect?: ");
        int collectedApples;
        collectedApples = input.nextInt();

        System.out.println("How many grapes did you collect?: ");
        int collectedGrapes;
        collectedGrapes = input.nextInt();

        if (collectedOranges < 0 || collectedApples < 0 || collectedGrapes < 0) {
            playerScore = -999;
            System.out.println("Invalid Player Score or Input");
        } else {
            playerScore += ((double) collectedOranges * orangePoints) + ((double) collectedApples * applePoints)
                    + ((double) collectedGrapes * grapePoints);
            System.out.println("Player 1 Score is now: " + playerScore + "\n");
        }
    }

    public void highScores() {
        System.out.println("Player 1: " + playerScore);
        System.out.println("Player 2:" + playerScoreTwo);

        if (playerScore < playerScoreTwo) {
            System.out.println("Player 2 Wins!");
        } else {
            System.out.println("Player 1 Wins!");
        }

    }
}
