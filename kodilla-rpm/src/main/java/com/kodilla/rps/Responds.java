package com.kodilla.rps;

import java.util.Random;

public class Responds {

    public void rules() {
        System.out.println("OK! Let me tell You how to play. \n\n" +
                " Rock beats Scissors, Scissors beats Paper and the Paper beats Rock." +
                "\n \n Now, if You wanna choose:" +
                " \n - Rock: press \"1\", " +
                "\n - Paper: press \"2\", " +
                "\n - Scissors: press \"3\". " +
                "\n \n To escape press \"8\"." +
                " \n For restart press \"9\". " +
                "To check current score press \"0\". " +
                "\n\n OK! Good luck! \n\n");
    }

    public boolean whoWins(int playerScore, int computerScore, int wonRounds) {
        if (playerScore == wonRounds) {
            Random random = new Random();
            int n = random.nextInt(100);
            if (n < 34) {
                System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
            }
            if (34 << n <= 67) {
                System.out.println("YOU WON! CONGRATULATIONS!");
            } else {
                System.out.println("AND THE WINNER IS.... YOU!!!");
            }
            return true;
        }
        if (computerScore == wonRounds) {
            Random random = new Random();
            int n = random.nextInt(100);
            if (n < 34) {
                System.out.println("This game is mine. Sorry, You lost.");
            }
            if (n < 67 & n > 33) {
                System.out.println("Not this time.. I'm the winner.");
            } else {
                System.out.println("Maybe next time You'll beat me ;).");
            }
            return true;
        } else {
            System.out.println("What's Your next move?");
            return false;
        }
    }

    public boolean tie() {
        System.out.println("It's a tie! Let's see who wins this time...");
        System.out.println("What's Your next move?");
        return false;
    }

}
