package com.kodilla.sudoku;

import org.junit.Assert;
import org.junit.Test;

public class SudokuTestSuite {
    @Test
    public void testIfGameEndsWhenNoZeros() {
        //Given
        SudokuBoard board = new SudokuBoard();
        board.setEmptyBoard();
        AddElement addElement = new AddElement(board);
addElement.addElement(2,2,5);

        EndGameControler endGameControler = new EndGameControler(board);
        //When
        boolean endGame = endGameControler.isEndGame();

        //Then
        Assert.assertEquals(false, endGame);

    }
}
