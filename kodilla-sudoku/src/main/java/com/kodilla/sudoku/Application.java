package com.kodilla.sudoku;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

            if (gameFinished) {
                SudokuBoard sudokuBoard = new SudokuBoard();
                sudokuBoard.setEmptyBoard();
                System.out.println(sudokuBoard);
                EnterCoordinates enter = new EnterCoordinates();
                AddElement addElement = new AddElement(sudokuBoard);
                EndGameControler endGameControler = new EndGameControler(sudokuBoard);

                while (!endGameControler.isEndGame()) {
                    enter.nextmove(sudokuBoard);
                    addElement.add(enter.getX(), enter.getY(), enter.getValue());
                }
            }
        }
    }
}

