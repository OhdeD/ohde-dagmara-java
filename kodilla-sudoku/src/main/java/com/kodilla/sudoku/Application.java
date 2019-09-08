package com.kodilla.sudoku;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (gameFinished == false) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

        }
        if (gameFinished) {

            SudokuBoard sudokuBoard = new SudokuBoard();
            sudokuBoard.setEmptyBoard();
            System.out.println(sudokuBoard);

        } else {
            System.out.println("dupa");
        }
    }


}

