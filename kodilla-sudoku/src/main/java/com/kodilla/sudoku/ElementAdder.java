package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ElementAdder {
    private SudokuBoard sudokuBoard;

    public ElementAdder(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void add(int x, int y, int value) {
        SudokuElement coordinates = sudokuBoard.getBoard().get(y - 1).getRow().get(x - 1);
        coordinates.setValue(value);
        for (SudokuElement e : sudokuBoard.getBoard().get(y - 1).getRow()) {
            List<Integer> newPossibilities = e.getPossibilities().stream()
                    .filter(i -> !Objects.equals(i, value))
                    .collect(Collectors.toList());
            e.setPossibilities(newPossibilities);
        }

        for (SudokuRow r : sudokuBoard.getBoard()) {
            SudokuElement i = r.getRow().get(x - 1);

            List<Integer> newPossibilities = i.getPossibilities().stream()
                    .filter(n -> !Objects.equals(n, value))
                    .collect(Collectors.toList());
            i.setPossibilities(newPossibilities);
        }
        CheckBoxes checkBoxes = new CheckBoxes(sudokuBoard);
        checkBoxes.check(x,y,value);
    }
}
