package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuElement.EMPTY;

public class SudokuResolve {
    private SudokuBoard board;

    public SudokuResolve(SudokuBoard board) {
        this.board = board;
    }

    public void resolve() {
        AddElement addElement = new AddElement(board);
        for (int y = 1; y < 10; y++) {
            for (int x = 1; x < 10; x++) {
                SudokuElement element = board.getBoard().get(y - 1).getRow().get(x - 1);
                if (element.getValue() == 0) {
                    int q = element.getPossibilities().size();
                    int toPut = element.getPossibilities().get(q-1);
                    addElement.add(x, y, toPut);

                }
            }
        }
    }
}
