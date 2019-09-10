package com.kodilla.sudoku;

import java.util.List;

public class EasySet {

    public List<SudokuRow> setEasyBoard(SudokuBoard sudokuBoard) {
        sudokuBoard.setEmptyBoard();
        AddElement addElement = new AddElement(sudokuBoard);
        addElement.add(2,1,6);
        addElement.add(4,1,3);
        addElement.add(5,1,7);
        addElement.add(7,1,4);
        addElement.add(9,1,8);
        addElement.add(1,2,5);
        addElement.add(8,2,6);
        addElement.add(2,3,8);
        addElement.add(3,3,7);
        addElement.add(5,3,6);
        addElement.add(6,3,9);
        addElement.add(9,3,1);
        addElement.add(1,4,8);
        addElement.add(2,4,2);
        addElement.add(4,4,9);
        addElement.add(7,4,5);
        addElement.add(9,4,4);
        addElement.add(4,5,7);
        addElement.add(6,5,5);
        addElement.add(9,5,9);
        addElement.add(2,6,5);
        addElement.add(6,6,6);
        addElement.add(7,6,1);
        addElement.add(9,6,2);
        addElement.add(2,7,9);
        addElement.add(3,7,8);
        addElement.add(6,7,2);
        addElement.add(8,7,4);
        addElement.add(9,7,5);
        addElement.add(2,8,7);
        addElement.add(4,8,4);
        addElement.add(6,8,8);
        addElement.add(2,9,4);
        addElement.add(3,9,3);
        addElement.add(4,9,1);
        addElement.add(9,9,6);
        return sudokuBoard.getBoard();
    }
}
