package com.kodilla.spring.rps;

import java.util.Scanner;

public class Restarter {
    private Responder responder;
    private Scanner scanner;
    private GameProcessor processor;

    public Restarter(Responder responder, Scanner scanner, GameProcessor processor) {
        this.responder = responder;
        this.scanner = scanner;
        this.processor = processor;
    }

    public void restart(String name) {
        responder.restartConfirmAsk();
        int restart = scanner.nextInt();

        if (restart == 9) {
            responder.howManyRounds(name);
            int wonRounds = scanner.nextInt();
            responder.restart();
            processor.setPlayerScore(0);
            processor.setComputerScore(0);
            processor.setWonRounds(wonRounds);
        } else {
            responder.backToGame();
            responder.currentScore(processor.getPlayerScore(), processor.getComputerScore(), processor.getWonRounds());
        }
    }
}
