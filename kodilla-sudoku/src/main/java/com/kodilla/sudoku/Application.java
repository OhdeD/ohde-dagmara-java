package com.kodilla.sudoku;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (gameFinished == false) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();


            if (gameFinished) {
                SudokuBoard sudokuBoard = new SudokuBoard();
                sudokuBoard.setEmptyBoard();
                System.out.println(sudokuBoard);
                EnterCoordinates enter = new EnterCoordinates();
                AddElement addElement = new AddElement(sudokuBoard);

                enter.nextmove();
                addElement.add(enter.getX(), enter.getY(), enter.getValue());
            }
        }
    }


}

