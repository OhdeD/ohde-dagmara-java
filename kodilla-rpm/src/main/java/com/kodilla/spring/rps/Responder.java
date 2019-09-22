package com.kodilla.spring.rps;

public class Responder {

    public void showRules() {
        System.out.println("OK! Let me tell You how to play. \n\n" +
                " Rock beats Scissors, Scissors beats Paper and the Paper beats Rock." +
                "\n \n Now, if You wanna choose:" +
                " \n - Rock: press \"1\", " +
                "\n - Paper: press \"2\", " +
                "\n - Scissors: press \"3\". " +
                "\n - Spock: press \"4\". " +
                "\n - Lizzard: press \"5\". " +
                "\n \n To escape press \"8\"." +
                " \n For restart press \"9\". " +
                "To check current score press \"0\". " +
                "\n\n OK! Good luck! \n\n");
    }
    public void askForName(){
        System.out.println("Enter Your name: ");
    }

    public void welcome(String name){
        System.out.println("Hi " + name.toUpperCase() + "! Let's play Rock-Paper-Scissors!\n");
    }

    public void howManyRounds(String name){
        System.out.println("Up to how many wins do You wanna play " + name.toUpperCase() + "?");
    }

    public void askForFirstMove(){
        System.out.println("What's Your first move?");
    }

    public void playersVictoryAnnounce(int n) {
        if (n < 34) {
            System.out.println("CONGRATULATIONS! YOU WON! YOU ARE THE BEST!");
        }
        if (34 << n <= 67) {
            System.out.println("YOU WON! CONGRATULATIONS!");
        } else {
            System.out.println("AND THE WINNER IS.... YOU!!!");
        }
    }

    public void computersVictoryAnnounce(int n) {
        if (n < 34) {
            System.out.println("This game is mine. Sorry, You lost.");
        }
        if (n < 67 & n > 33) {
            System.out.println("Not this time.. I'm the winner.");
        } else {
            System.out.println("Maybe next time You'll beat me ;).");
        }
    }

    public boolean tieAnnounce() {
        System.out.println("It's a tie! Let's see who wins this time...");
        return false;
    }

    public void  paperBeatsRock(int computerMove){
        System.out.println("I gave " + computerMove + ". Paper beats the Rock!");
    }

    public void  rockBeatsScissors(int computerMove){
        System.out.println("I gived " + computerMove + ". Rock beats the Scissors! :)");
    }

    public void scissorsBeatsPaper(int computerMove){
        System.out.println("I gaved " + computerMove + ". Scissors beats the Paper!");
    }

    public void  lizzardBeatsSpock(int computerMove){
        System.out.println("I gave " + computerMove + ". Lizzard beats the Spock!");
    }

    public void  rockBeatsLizzard(int computerMove){
        System.out.println("I gave " + computerMove + ". Rock beats the Lizzard!");
    }

    public void  scissorsBeatsLizzard(int computerMove){
        System.out.println("I gave " + computerMove + ". Scissors beats the Lizzard!");
    }

    public void  spockBeatsScissors(int computerMove){
        System.out.println("I gave " + computerMove + ". Spock beats the Scissors!");
    }

    public void  lizzardBeatsPaper(int computerMove){
        System.out.println("I gave " + computerMove + ". Lizzard beats the Paper!");
    }

    public void  paperBeatsSpock(int computerMove){
        System.out.println("I gave " + computerMove + ". Paper beats the Spock!");
    }

    public void  spockBeatsRock(int computerMove){
        System.out.println("I gave " + computerMove + ". Spock beats the Rock!");
    }

    public void uWon(){
        System.out.println("Congratulations! You won this time!");
    }

    public void compWon(){
        System.out.println("This round is mine");
    }

    public void nextMoveRequest() {
        System.out.println("What's Your next move?");
    }

    public void quitConfirmAsk(){
        System.out.println("If You really want to quit, press \"8\" again. Otherwise press anything else.");
    }
    public void quitConfirm(){
        System.out.println("Thanks for Playing. See You another time. :) ");
    }

    public void backToGame(){
        System.out.println("Ok. Let's go back to our game.");
    }

    public void currentScore(int playerScore, int computerScore, int wonRounds){
        System.out.println("Current game: player: " + playerScore + " computer: " + computerScore + ". We play until " + wonRounds + ".");
    }

    public void restartConfirmAsk(){
        System.out.println("Do You really want to restart this game? If so, press \"9\" again. Otherwise press anything else.");
    }
    public void restart(){
        System.out.println("Ok. Let's start again.");
    }

    public  void newGame(){
        System.out.println("Do you wanna play again? Press \"1\" for \"YES\" or \"2\" for \"NO\".");
    }

    public void bye(){
        System.out.println("OK. Thanks. Have a good one :).");
    }

    public void endAnnounce(int playerScore, int computerScore){
        if (playerScore<computerScore){
            System.out.println("END GAME \n You lost this game.");
        } else {
            System.out.println("YEA! You didt it! You won! BRAVO! ;)");
        }

    }
}
