package com.kodilla.sudoku;
public class Prototype<SudokuBoard> implements Cloneable {
    @Override
    public SudokuBoard clone() throws CloneNotSupportedException {
        Object o;
        return (SudokuBoard)super.clone();
    }
}