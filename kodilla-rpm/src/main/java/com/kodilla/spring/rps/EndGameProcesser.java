package com.kodilla.spring.rps;

import java.util.Scanner;

public class EndGameProcesser {
    private Scanner scanner;
    private Responder responder;
    private GameProcessor processor;
    private boolean endGame;
    private int wonRounds;

    public EndGameProcesser(Scanner scanner, Responder responder, GameProcessor processor) {
        this.scanner = scanner;
        this.responder = responder;
        this.processor = processor;
    }

    public boolean end (String name) {
        responder.newGame();
        int playAgain = scanner.nextInt();
        if (playAgain == 1) {
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

    public int getWonRounds() {
        return wonRounds;
    }
}
