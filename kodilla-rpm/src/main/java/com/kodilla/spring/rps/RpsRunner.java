package com.kodilla.spring.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Random game = new Random();

        Responder responder = new Responder();
        GameWinnerChecker winner = new GameWinnerChecker(responder);
        Scanner scanner = new Scanner(System.in);

        responder.askForName();
        String name = scanner.nextLine();
        responder.welcome(name);
        responder.howManyRounds(name);
        int wonRounds = scanner.nextInt();

        GameProcessor processor = new GameProcessor(responder, winner, wonRounds);
        Quitter quitter = new Quitter(responder, scanner);
        Restarter restarter = new Restarter(responder, scanner, processor);
        EndGameProcesser endGameProcessor = new EndGameProcesser(scanner, responder, processor);

        responder.showRules();
        responder.askForFirstMove();
        boolean endGame = true;
        boolean end = false;
        while (!end) {
            int playerMove = scanner.nextInt();
            int computerMove = game.nextInt(2) + 1;

            if (playerMove < 4 && playerMove != 0) {
                endGame = processor.process(playerMove, computerMove);
            } else if (playerMove == 8) {
                end = quitter.quit(processor.getPlayerScore(), processor.getComputerScore(), processor.getWonRounds());
            }else if (playerMove == 9) {
                restarter.restart(name);
            }else if (playerMove == 0) {
                responder.currentScore(processor.getPlayerScore(),processor.getComputerScore(), processor.getWonRounds());
            }

            if (endGame) {
                end = endGameProcessor.end(name);
                endGame = endGameProcessor.isEndGame();
                wonRounds = endGameProcessor.getWonRounds();
            }
            if (!end) {
                responder.nextMoveRequest();
            }
        }

    }

}


