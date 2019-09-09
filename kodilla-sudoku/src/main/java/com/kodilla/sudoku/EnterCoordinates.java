package com.kodilla.sudoku;

import java.util.Scanner;

public class EnterCoordinates {
    private int x;
    private int y;
    private int value;
    Scanner scanner = new Scanner(System.in);

    public void nextmove(SudokuBoard board) {
        System.out.println("Enter your next move:");
        String coordinates = scanner.nextLine();
        if (coordinates.equals("sudoku")) {
            SudokuResolve resolve = new SudokuResolve(board);
            resolve.resolve();
        } else {
            try {
                x = Integer.parseInt(coordinates.substring(0, 1));
                y = Integer.parseInt(coordinates.substring(2, 3));
                value = Integer.parseInt(coordinates.substring(4, 5));
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong, try again");
            }
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getValue() {
        return value;
    }
}
