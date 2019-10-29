package com.kodilla.spring.rps;

import java.util.Scanner;

public class EndGameProcessor {
    private Scanner scanner;
    private Responder responder;
    private GameProcessor processor;
    private boolean endGame;
    private int wonRounds;

    public EndGameProcessor(Scanner scanner, Responder responder, GameProcessor processor) {
        this.scanner = scanner;
        this.responder = responder;
        this.processor = processor;
    }

    public boolean end (String name) {
        responder.newGame();
        String playAgain = scanner.nextLine();
        if (playAgain == "y") {
            endGame = false;
            processor.setPlayerScore(0);
            processor.setComputerScore(0);
            responder.howManyRounds(name);
            wonRounds = scanner.nextInt();
            processor.setWonRounds(wonRounds);
            return false;
        } else {
           responder.bye();
            return true;
        }
    }

    public boolean isEndGame() {
        return endGame;
    }
}
