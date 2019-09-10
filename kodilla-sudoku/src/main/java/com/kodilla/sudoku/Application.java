package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) {
        boolean gameNotFinished = true;
        while (gameNotFinished) {
            SudokuGame theGame = new SudokuGame();
            gameNotFinished = theGame.resolveSudoku();
            if (gameNotFinished) {
                SudokuBoard sudokuBoard = new SudokuBoard();
                EasySet easySet = new EasySet();
                easySet.setEasyBoard(sudokuBoard);
                System.out.println(sudokuBoard);
                UserDialogue dialogueManager = new UserDialogue();
                ElementAdder elementAdder = new ElementAdder(sudokuBoard);
                EndGameChecker endGameChecker = new EndGameChecker(sudokuBoard);
                while (!endGameChecker.isEndGame()) {
                    if (dialogueManager.getNextMove()) {
                        elementAdder.add(dialogueManager.getX(), dialogueManager.getY(), dialogueManager.getValue());
                        System.out.println(sudokuBoard);
                        dialogueManager.displayLastMove();
                    } else {
                        new SudokuResolve(sudokuBoard).resolve();
                        System.out.println(sudokuBoard);
                    }
                }
            }
        }
    }
}

