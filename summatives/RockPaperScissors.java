package com.tsg.summatives;


import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nick9
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        String playAgain;

        do {
            int compWins = 0;
            int userWins = 0;
            int tie = 0;
            int rounds = 0;

            Scanner userInput = new Scanner(System.in);
            Random random = new Random();

            System.out.println(" Lets play Rock Paper Scissors");

            System.out.println("How many games do you want to play? (1 - 10)");

            int numOfGames = userInput.nextInt();
            for (int i = 0; i < numOfGames; i++) {
                if (numOfGames > 10 || numOfGames < 1){
                    
                    System.out.println("Invaild number of games");
                    break;
                } else {
                    System.out.println("Let's play");
                }

                System.out.println("pick a number");
                System.out.println("Hint: 1 = Rock, 2 = Paper, 3 = Scissors");
                int userNum = userInput.nextInt();
                int comp = random.nextInt(3) + 1;

                if (userNum == comp) {
                    System.out.println("Tie Game!");

                    tie++;
                    rounds++;
                } else {
                    if (comp == 1 && userNum == 3) {
                        System.out.println("Computer picked Rock!");
                        System.out.println("You picked Scissors!");
                        System.out.println("Rock beats Scissors!");
                        System.out.println("!!!!Computer Wins!!!!");

                        compWins++;
                        rounds++;
                    }

                    if (comp == 1 && userNum == 2) {
                        System.out.println("Computer picked Rock!");
                        System.out.println("You picked Paper!");
                        System.out.println("Paper beats Rock!");
                        System.out.println("!!!!Player Wins!!!!");

                        userWins++;
                        rounds++;
                    }

                    if (comp == 2 && userNum == 3) {
                        System.out.println("Computer picked Paper!");
                        System.out.println("You picked Scissors!");
                        System.out.println("Scissors beats Paper!");
                        System.out.println("!!!!Player Wins!!!!");

                        userWins++;
                        rounds++;
                    }

                    if (comp == 2 && userNum == 1) {
                        System.out.println("Computer picked Paper!");
                        System.out.println("You picked Rock!");
                        System.out.println("Paper beats Rock!");
                        System.out.println("!!!!Computer Wins!!!!");

                        compWins++;
                        rounds++;
                    }

                    if (comp == 3 && userNum == 1) {
                        System.out.println("Computer picked Scissors!");
                        System.out.println("You picked Rock!");
                        System.out.println("Rock beats Scissors!");
                        System.out.println("!!!!Player Wins!!!!");

                        userWins++;
                        rounds++;
                    }

                    if (comp == 3 && userNum == 2) {
                        System.out.println("Computer picked Scissors!");
                        System.out.println("You picked Paper!");
                        System.out.println("Scissors beats Paper!");
                        System.out.println("!!!!Computer Wins!!!!");

                        compWins++;
                        rounds++;

                    }

                }
            }
            System.out.println("Here are the final scores after " + rounds + " rounds:");

            System.out.println("Player wins = " + userWins);
            System.out.println("Computer Wins = " + compWins);
            System.out.println("Ties = " + tie);
            

             //end of loop
            System.out.println("Would you like yo play again? y/n");
            playAgain = userInput.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!!!!!");
    }

}
