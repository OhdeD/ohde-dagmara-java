package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your name: ");

        String name = scanner.nextLine();

        System.out.println("Hi " + name.toUpperCase() + "! Let's play Rock-Paper-Scissors!\n");
        System.out.println("Up to how many wins do You wanna play " + name.toUpperCase() + "?");

        int wonRounds = scanner.nextInt();

        System.out.println("OK! Let me tell You how to play. \n\n Rock beats Scissors, Scissors beats Paper and the Paper beats Rock.\n \n Now, if You wanna choose: \n - Rock: press \"1\", \n - Paper: press \"2\", \n - Scissors: press \"3\". ");
        System.out.println("\"n\" \"n\" To escape press \"8\". \n For restart press \"9\". To check current score press \"0\". \n\n OK! Good luck! ");

        Random game = new Random();

        int playerScore = 0;
        int computerScore = 0;

        boolean end = false;
        boolean endGame = true;
        System.out.println("What's Your first move?");

        while (!end) {
            int playerMove = scanner.nextInt();
            int computerMove = game.nextInt(2) + 1;

            if (playerMove == computerMove) {
                System.out.println("It's a tie! Let's see who wins this time...");
                System.out.println("What's Your next move?");
            } else {

                if (playerMove == 1) {
                    if (computerMove == 2) {
                        computerScore++;
                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Paper beats the Rock! This time I won.");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    } else {
                        playerScore++;
                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Congrats! You won this round! Rock beats the Scissors! :)");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    }
                }
                if (playerMove == 2) {
                    if (computerMove == 1) {
                        playerScore++;
                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Congrats! You won this round! Paper beats the Rock! :)");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    } else {
                        computerScore++;

                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Scissors beats the Paper! This time You lost.");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    }
                }
                if (playerMove == 3) {
                    if (computerMove == 1) {
                        computerScore++;
                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Rock beats the Scissors! This time I won.");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    } else {
                        playerScore++;
                        System.out.println("I gived " + computerMove + ".");
                        System.out.println("Yep, You won this one! Scissors beats the Paper! :)");
                        if (playerScore == wonRounds) {
                            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
                            endGame = true;
                        }
                        if (computerScore == wonRounds) {
                            System.out.println("This game is mine. Sorry, You lost.");
                            endGame = true;
                        } else {
                            System.out.println("What's Your next move?");
                        }

                    }
                }
            }
            if (playerMove == 8) {
                System.out.println("If You really want to quit, press \"x\" again. Otherwise press anything else.");
                int quit = scanner.nextInt();
                if (quit == 8) {
                    System.out.println("Thanks for Playing. See You another time. :) ");
                    end = true;
                } else {
                    System.out.println("Ok. Let's go back to our game. It looks like You scored: " + playerScore + " while I scored: " + computerScore + ".");
                }
            }
            if (playerMove == 9) {
                System.out.println("Do You really want to restart this game? If so, press \"9\" again. Otherwise press anything else.");
                int restart = scanner.nextInt();
                if (restart == 9) {
                    System.out.println("Ok. Let's start again.");
                    playerScore = 0;
                    computerScore = 0;
                    System.out.println("What's Your first move?");

                } else {
                    System.out.println("Ok. Let's go back to our game. It looks like You scored: " + playerScore + " while I scored: " + computerScore + ".");
                }
            }
            if (playerMove == 0) {
                System.out.println("Current game: player: " + playerScore + " computer: " + computerScore + ". We play until " + wonRounds + ".\n What's Your next move?");
            }
            if (endGame) {
                System.out.println("Do you wanna play again? Press \"1\" for \"YES\" or \"2\" for \"NO\".");
                int playAgain = scanner.nextInt();
                if (playAgain == 1) {
                    end = false;
                    endGame = false;
                    playerScore = 0;
                    computerScore = 0;
                    System.out.println("How many rounds this time?");
                    wonRounds = scanner.nextInt();
                    System.out.println("What is Your next move?");
                } else {
                    System.out.println("OK. Thanks. Have a good one :).");
                    end = true;
                }
            }
        }
    }
}


