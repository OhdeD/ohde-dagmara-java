package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SudokuElement {
    public static int EMPTY = 0;
    private int value;
    private List<Integer> possibilities = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;
        for (int i = 1; i<10 ; i++) {
            possibilities.add(i);
        }
    }

    public List<Integer> getPossibilities() {
        return possibilities;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPossibilities(List<Integer> newPossibilities) {
        this.possibilities.clear();
        this.possibilities = newPossibilities;
    }

    @Override
    public String toString() {
        return  value + "";
    }
}
