package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
            System.out.println(sudokuBoard);
            System.out.println(value + " was added to board.");
        } else {
            System.out.println("You can't add this here.");
        }
    }
}
