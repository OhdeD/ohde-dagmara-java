package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    List<SudokuElement> row = new ArrayList<>();

    public void addElement(SudokuElement sudokuElement){
        row.add(sudokuElement);
    }

    public List<SudokuElement> getRow() {
        return row;
    }

    @Override
    public String toString() {
        String toReturn = "| ";
        for (int i = 0; i <9; i++){
            toReturn += row.get(i) + " | ";
        }
        return  toReturn ;
    }
}
