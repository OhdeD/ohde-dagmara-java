package com.kodilla.spring.rps;

public class GameProcessor {
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;
    public static final int SPOCK = 4;
    public static final int LIZZARD = 5;
    private Responder responder;
    private GameWinnerChecker winner;
    private int wonRounds;


    public GameProcessor(Responder responder, GameWinnerChecker winner, int wonRounds) {
        this.responder = responder;
        this.winner = winner;
        this.wonRounds = wonRounds;
    }

    private boolean endGame;
    private int computerScore = 0;
    private int playerScore = 0;

    public boolean process(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            endGame = responder.tieAnnounce();
        } else if (playerMove == ROCK) {
            if (computerMove == PAPER) {
                computerScore++;
                responder.paperBeatsRock(computerMove);
                responder.compWon();
            } else if (computerMove == SPOCK) {
                computerScore++;
                responder.spockBeatsRock(computerMove);
                responder.compWon();
            } else if (computerMove == LIZZARD) {
                playerScore++;
                responder.rockBeatsLizzard(computerMove);
                responder.uWon();
            } else {
                playerScore++;
                responder.rockBeatsScissors(computerMove);
                responder.uWon();
            }
        } else if (playerMove == PAPER) {
            if (computerMove == ROCK) {
                playerScore++;
                responder.paperBeatsRock(computerMove);
                responder.uWon();
            } else if (computerMove == SPOCK) {
                playerScore++;
                responder.paperBeatsSpock(computerMove);
                responder.uWon();
            } else if (computerMove == LIZZARD) {
                computerScore++;
                responder.lizzardBeatsPaper(computerMove);
                responder.compWon();
            } else {
                computerScore++;
                responder.scissorsBeatsPaper(computerMove);
                responder.compWon();
            }
        } else if (playerMove == SCISSORS) {
            if (computerMove == ROCK) {
                computerScore++;
                responder.rockBeatsScissors(computerMove);
                responder.compWon();
            } else if (computerMove == SPOCK) {
                computerScore++;
                responder.spockBeatsScissors(computerMove);
                responder.compWon();
            } else if (computerMove == LIZZARD) {
                playerScore++;
                responder.scissorsBeatsLizzard(computerMove);
                responder.uWon();
            } else {
                playerScore++;
                responder.scissorsBeatsPaper(computerMove);
                responder.uWon();
            }
        } else if (playerMove == SPOCK) {
            if (computerMove == ROCK) {
                playerScore++;
                responder.spockBeatsRock(computerMove);
                responder.uWon();
            } else if (computerMove == PAPER) {
                computerScore++;
                responder.paperBeatsSpock(computerMove);
                responder.compWon();
            } else if (computerMove == LIZZARD) {
                computerScore++;
                responder.lizzardBeatsSpock(computerMove);
                responder.compWon();
            } else {
                playerScore++;
                responder.spockBeatsScissors(computerMove);
                responder.uWon();
            }
        } else if (playerMove == LIZZARD) {
            if (computerMove == ROCK) {
                computerScore++;
                responder.rockBeatsLizzard(computerMove);
                responder.compWon();
            } else if (computerMove == PAPER) {
                playerScore++;
                responder.lizzardBeatsPaper(computerMove);
                responder.uWon();
            } else if (computerMove == SPOCK) {
                playerScore++;
                responder.lizzardBeatsSpock(computerMove);
                responder.uWon();
            } else {
                computerScore++;
                responder.scissorsBeatsLizzard(computerMove);
                responder.compWon();
            }
        }
        endGame = winner.check(playerScore, computerScore, wonRounds);
        return endGame;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int getWonRounds() {
        return wonRounds;
    }

    public int getPlayerScore() {
        return playerScore;

    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setWonRounds(int wonRounds) {
        this.wonRounds = wonRounds;
    }
}

