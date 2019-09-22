package com.kodilla.spring.rps;

public class GameProcessor {
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
        } else if (playerMove == 1) {
            if (computerMove == 2) {
                computerScore++;
                responder.paperBeatsRock(computerMove);
                responder.compWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);
            } else {
                playerScore++;
                responder.rockBeatsScissors(computerMove);
                responder.uWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);
            }
        } else if (playerMove == 2) {
            if (computerMove == 1) {
                playerScore++;
                responder.paperBeatsRock(computerMove);
                responder.uWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);

            } else {
                computerScore++;
                responder.scissorsBeatsPaper(computerMove);
                responder.compWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);
            }
        } else if (playerMove == 3) {
            if (computerMove == 1) {
                computerScore++;
                responder.rockBeatsScissors(computerMove);
                responder.compWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);
            } else {
                playerScore++;
                responder.scissorsBeatsPaper(computerMove);
                responder.uWon();
                endGame = winner.check(playerScore, computerScore, wonRounds);
            }
        }
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

