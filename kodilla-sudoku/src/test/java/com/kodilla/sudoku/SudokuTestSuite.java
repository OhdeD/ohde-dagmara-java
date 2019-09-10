package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void testIfGameEndsWhenNoZeros() {
        //Given
        SudokuBoard board = new SudokuBoard();
        board.setEmptyBoard();
        ElementAdder elementAdder = new ElementAdder(board);
        elementAdder.add(2, 2, 5);

        EndGameChecker endGameChecker = new EndGameChecker(board);
        //When
        boolean endGame = endGameChecker.isEndGame();

        //Then
        Assert.assertEquals(false, endGame);

    }
}
