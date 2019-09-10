package com.kodilla.sudoku;

import java.util.Scanner;

public class UserDialogue {
    private int x;
    private int y;
    private int value;
    Scanner scanner = new Scanner(System.in);

    public boolean getNextMove() {
        System.out.println("Enter your next move:");
        String coordinates = scanner.nextLine();
        boolean result;
        if (coordinates.equals("sudoku")) {
            result = false;
        } else {
            try {
                x = Integer.parseInt(coordinates.substring(0, 1));
                y = Integer.parseInt(coordinates.substring(2, 3));
                value = Integer.parseInt(coordinates.substring(4, 5));
            } catch (NumberFormatException e) {
                System.out.println("Something went wrong, try again");
            }
            result = true;
        }
        return result;
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

    public void displayLastMove() {
        System.out.println(getValue() + " was added to board.");
    }
}
