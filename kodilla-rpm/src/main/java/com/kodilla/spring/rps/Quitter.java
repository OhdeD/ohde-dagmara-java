package com.kodilla.spring.rps;

import java.util.Scanner;

public class Quitter {
    private Responder responder;
    private Scanner scanner;

    public Quitter(Responder responder, Scanner scanner) {
        this.responder = responder;
        this.scanner = scanner;
    }

    public boolean quit(int playerScore, int computerScore, int wonRounds) {
       responder.quitConfirmAsk();
            int quit = scanner.nextInt();
            if (quit == 8) {
                responder.quitConfirm();
                return true;
            } else {
                responder.backToGame();
                responder.currentScore(playerScore, computerScore, wonRounds);
            return false;
            }
        }
    }

