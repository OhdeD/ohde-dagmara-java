package com.kodilla.sudoku;

public class GuessNumber {
    private SudokuBoard board;

    public GuessNumber(SudokuBoard board) {
        this.board = board;
    }

    public boolean guess() {
        ElementAdder elementAdder = new ElementAdder(board);
        for (int y = 1; y < 10; y++) {
            for (int x = 1; x < 10; x++) {
                SudokuElement element = board.getBoard().get(y - 1).getRow().get(x - 1);
                if (element.getValue() == 0) {
                    int toPut = element.getPossibilities().get(element.getPossibilities().size() - 1);
                    elementAdder.add(x, y, toPut);
                    return true;
                }
            }
        }
        return false;
    }
}