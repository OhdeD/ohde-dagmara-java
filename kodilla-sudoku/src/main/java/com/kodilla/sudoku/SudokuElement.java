package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuElement {
    public static int EMPTY = 0;
    private int value;
    List<Integer> possibilities = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;

        for (int i = 1; i == 9; i++) {
            possibilities.add(i);
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  value + "";
    }
}
