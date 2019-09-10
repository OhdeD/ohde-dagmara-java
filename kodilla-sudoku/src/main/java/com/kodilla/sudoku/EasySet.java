package com.kodilla.sudoku;

import java.util.List;

public class EasySet {

    public List<SudokuRow> setEasyBoard(SudokuBoard sudokuBoard) {
        sudokuBoard.setEmptyBoard();
        ElementAdder elementAdder = new ElementAdder(sudokuBoard);
        elementAdder.add(2,1,6);
        elementAdder.add(4,1,3);
        elementAdder.add(5,1,7);
        elementAdder.add(7,1,4);
        elementAdder.add(9,1,8);
        elementAdder.add(1,2,5);
        elementAdder.add(8,2,6);
        elementAdder.add(2,3,8);
        elementAdder.add(3,3,7);
        elementAdder.add(5,3,6);
        elementAdder.add(6,3,9);
        elementAdder.add(9,3,1);
        elementAdder.add(1,4,8);
        elementAdder.add(2,4,2);
        elementAdder.add(4,4,9);
        elementAdder.add(7,4,5);
        elementAdder.add(9,4,4);
        elementAdder.add(4,5,7);
        elementAdder.add(6,5,5);
        elementAdder.add(9,5,9);
        elementAdder.add(2,6,5);
        elementAdder.add(6,6,6);
        elementAdder.add(7,6,1);
        elementAdder.add(9,6,2);
        elementAdder.add(2,7,9);
        elementAdder.add(3,7,8);
        elementAdder.add(6,7,2);
        elementAdder.add(8,7,4);
        elementAdder.add(9,7,5);
        elementAdder.add(2,8,7);
        elementAdder.add(4,8,4);
        elementAdder.add(6,8,8);
        elementAdder.add(2,9,4);
        elementAdder.add(3,9,3);
        elementAdder.add(4,9,1);
        elementAdder.add(9,9,6);
        return sudokuBoard.getBoard();
    }
}
