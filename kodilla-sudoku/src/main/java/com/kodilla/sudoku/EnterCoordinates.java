package com.kodilla.sudoku;

import java.util.Scanner;

public class EnterCoordinates {
    private int x;
    private int y;
    private int value;
    Scanner scanner = new Scanner(System.in);

    public void nextmove() {
        System.out.println("Enter your next move:");
        String coordinates = scanner.nextLine();
        x = Integer.parseInt(coordinates.substring(0, 1));
        y = Integer.parseInt(coordinates.substring(2, 3));
        value = Integer.parseInt(coordinates.substring(4, 5));
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
