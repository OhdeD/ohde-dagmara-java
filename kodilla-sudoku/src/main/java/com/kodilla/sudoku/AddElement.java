package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddElement {
    private SudokuBoard sudokuBoard;

    public AddElement(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void add(int x, int y, int value) {
        SudokuElement coordinates = sudokuBoard.getBoard().get(y - 1).getRow().get(x - 1);
        boolean canAddThisVaue = coordinates.getPossibilities().stream()
                .anyMatch(a -> a.equals(value));
        if (canAddThisVaue) {
            coordinates.setValue(value);

            for (SudokuElement e :sudokuBoard.getBoard().get(y - 1).getRow()) {
                if (e.getPossibilities().get(value-1) != null) {
                    e.getPossibilities().remove(value-1);
                }
            }

            for (SudokuRow r : sudokuBoard.getBoard()) {
                SudokuElement i = r.getRow().get(x - 1);
                if (i.getPossibilities().get(value-1) != null) {
                    i.getPossibilities().remove(value-1);
                }
            }
            System.out.println(sudokuBoard);
            System.out.println(value + " was added to board.");
        } else {
            System.out.println("You can't add " + value + " here.");
        }
    }
}
