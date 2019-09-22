package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuBoard extends Prototype {
    private List<SudokuRow> board = new ArrayList<>();

    public List<SudokuRow> setEmptyBoard() {
        for (int i = 1; i < 10; i++) {
            SudokuRow row = new SudokuRow();
            for (int n = 1; n < 10; n++) {
                row.addElement(new SudokuElement(EMPTY));
            }
            board.add(row);
        }
        return board;
    }

    @Override
    public String toString() {
        String a = "";
        for (int i = 0; i < 9; i++) {
            a += "" + board.get(i) + " \n";
        }
        return a;

    }

    public List<SudokuRow> getBoard() {
        return board;
    }
}
