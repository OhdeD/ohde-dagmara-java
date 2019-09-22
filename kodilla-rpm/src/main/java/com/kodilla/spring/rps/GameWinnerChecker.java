package com.kodilla.spring.rps;

import java.util.Random;

public class GameWinnerChecker {
    private Responder responder;
    private Random random = new Random();

    public GameWinnerChecker(Responder responder) {
        this.responder = responder;
    }

    public boolean check(int playerScore, int computerScore, int wonRounds) {
        if (playerScore == wonRounds) {
            responder.playersVictoryAnnounce(random.nextInt(100));
            return true;
        }
        if (computerScore == wonRounds) {
            responder.computersVictoryAnnounce(random.nextInt(100));
            return true;
        } else {
            return false;
        }
    }

}
