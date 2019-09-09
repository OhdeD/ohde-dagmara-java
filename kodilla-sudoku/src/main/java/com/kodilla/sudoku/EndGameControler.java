package com.kodilla.sudoku;

public class EndGameControler {
    private SudokuBoard board;

    public EndGameControler(SudokuBoard board) {
        this.board = board;
    }
    public boolean isEndGame(){
        boolean isEndGame = board.getBoard()
                .stream()
                .flatMap(e->e.getRow().stream())
                .flatMap(e->e.getPossibilities().stream())
                .allMatch(e-> e.equals(SudokuElement.EMPTY));
        return isEndGame;
    }
}
