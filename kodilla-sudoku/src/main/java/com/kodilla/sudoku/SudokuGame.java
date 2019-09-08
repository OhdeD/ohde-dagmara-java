package com.kodilla.sudoku;

import java.util.Scanner;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuGame {
    Scanner scanner = new Scanner(System.in);

    public boolean resolveSudoku() {
        System.out.println("Do You wanna start a new Game? Press \"Y \" for YES and \"N\" for NO.");
        String playAgain = scanner.nextLine();
        if (playAgain.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public void setEmptyBoard() {
        SudokuBoard board = new SudokuBoard();
        board.setEmptyBoard();
    }

}
