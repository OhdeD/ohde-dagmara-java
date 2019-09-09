package com.kodilla.sudoku;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CheckBoxes {

private  SudokuBoard sudokuBoard;

    public CheckBoxes(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void check(int x, int y, int value){
        if ((x < 4) && (y < 4)) {
            for (int a = 0; a < 3; a++) {
                a = removeFromPossibilities1(value, a);
            }
        } else if ((x < 4) && (y < 7)) {
                for (int a = 3; a < 6; a++) {
                    a = removeFromPossibilities1(value, a);
                }
        }else if ((x < 4)  && (y < 10)) {
            for (int a = 6; a < 9; a++) {
                a = removeFromPossibilities1(value, a);
            }
        } else if ((x < 7) && (y < 4)) {
            for (int a = 0; a < 3; a++) {
                a = removeFromPossibilities2(value, a);
            }
        }else if ((x < 7) && (y < 7)) {
            for (int a = 3; a < 6; a++) {
                a = removeFromPossibilities2(value, a);
            }
        }else if ((x < 7) && (y < 10)) {
            for (int a = 6; a < 9; a++) {
                a = removeFromPossibilities2(value, a);
            }
        }else if ((x < 10) && (y < 3)) {
            for (int a = 0; a < 3; a++) {
                a = removeFromPossibilities3(value, a);
            }
        }else if ((x < 10) && (y < 7)) {
            for (int a = 3; a < 6; a++) {
                a = removeFromPossibilities3(value, a);
            }
        }else if ((x < 10) && (y < 10)) {
            for (int a = 6; a < 9; a++) {
                a = removeFromPossibilities3(value, a);
            }
        }
    }

    private int removeFromPossibilities1(int value, int a) {
        for (int b = 0; b < 3; b++) {
            SudokuElement element = sudokuBoard.getBoard().get(a).getRow().get(b);
            List<Integer> newPossibilities = element.getPossibilities().stream()
                    .filter(e -> !Objects.equals(e, value))
                    .collect(Collectors.toList());
            element.setPossibilities(newPossibilities);
        }
        a++;
        return a;
    }

    private int removeFromPossibilities2(int value, int a) {
        for (int b = 3; b < 6; b++) {
            SudokuElement element = sudokuBoard.getBoard().get(a).getRow().get(b);
            List<Integer> newPossibilities = element.getPossibilities().stream()
                    .filter(e -> !Objects.equals(e, value))
                    .collect(Collectors.toList());
            element.setPossibilities(newPossibilities);
        }
        a++;
        return a;
    }

    private int removeFromPossibilities3(int value, int a) {
        for (int b = 6; b < 9; b++) {
            SudokuElement element = sudokuBoard.getBoard().get(a).getRow().get(b);
            List<Integer> newPossibilities = element.getPossibilities().stream()
                    .filter(e -> !Objects.equals(e, value))
                    .collect(Collectors.toList());
            element.setPossibilities(newPossibilities);
        }
        a++;
        return a;
    }
}
