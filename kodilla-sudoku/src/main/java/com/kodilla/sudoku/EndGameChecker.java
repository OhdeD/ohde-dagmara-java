package com.kodilla.sudoku;

public class EndGameChecker {
    private SudokuBoard board;

    public EndGameChecker(SudokuBoard board) {
        this.board = board;
    }

    public boolean isEndGame() {
        boolean isEndGame = board.getBoard()
                .stream()
                .flatMap(e->e.getRow().stream())
               // .flatMap(e->e.getPossibilities().stream())
                .allMatch(e-> e.getValue() != SudokuElement.EMPTY);
        return isEndGame;
    }
}
