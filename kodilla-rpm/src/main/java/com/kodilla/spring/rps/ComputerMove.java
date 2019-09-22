package com.kodilla.spring.rps;

import java.util.Random;

import static com.kodilla.spring.rps.GameProcessor.*;

public class ComputerMove {
    private Random game = new Random();

    public int generateMove(int playersMove) {
        int random = game.nextInt(100);
        int computerMove;

        if (playersMove == ROCK) {
            if (random < 25) {
                computerMove = PAPER;
            } else if (random < 50) {
                computerMove = SPOCK;
            } else if (random < 75) {
                computerMove = ROCK;
            } else if (random < 87) {
                computerMove = LIZZARD;
            } else {
                computerMove = SCISSORS;
            }
        } else if (playersMove == PAPER) {
            if (random < 25) {
                computerMove = LIZZARD;
            } else if (random < 50) {
                computerMove = SCISSORS;
            } else if (random < 75) {
                computerMove = PAPER;
            } else if (random < 87) {
                computerMove = SPOCK;
            } else {
                computerMove = ROCK;
            }

        } else if (playersMove == SPOCK) {
            if (random < 25) {
                computerMove = PAPER;
            } else if (random < 50) {
                computerMove = LIZZARD;
            } else if (random < 75) {
                computerMove = SPOCK;
            } else if (random < 87) {
                computerMove = ROCK;
            } else {
                computerMove = SCISSORS;
            }
        } else if (playersMove == LIZZARD) {
            if (random < 25) {
                computerMove = ROCK;
            } else if (random < 50) {
                computerMove = SCISSORS;
            } else if (random < 75) {
                computerMove = LIZZARD;
            } else if (random < 87) {
                computerMove = PAPER;
            } else {
                computerMove = SPOCK;
            }
        } else {
            if (random < 25) {
                computerMove = ROCK;
            } else if (random < 50) {
                computerMove = SPOCK;
            } else if (random < 75) {
                computerMove = SCISSORS;
            } else if (random < 87) {
                computerMove = PAPER;
            } else {
                computerMove = LIZZARD;
            }
        }
        return computerMove;


    }
}
