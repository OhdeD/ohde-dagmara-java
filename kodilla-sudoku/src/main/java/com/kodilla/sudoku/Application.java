package com.kodilla.sudoku;

public class Application {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();

            if (gameFinished) {
                SudokuBoard sudokuBoard = new SudokuBoard();
                EasySet easySet = new EasySet();
                easySet.setEasyBoard(sudokuBoard);
                System.out.println(sudokuBoard);
                EnterCoordinates enter = new EnterCoordinates();
                AddElement addElement = new AddElement(sudokuBoard);
                EndGameControler endGameControler = new EndGameControler(sudokuBoard);

                while (!endGameControler.isEndGame()) {
                    enter.nextmove(sudokuBoard);
                    addElement.add(enter.getX(), enter.getY(), enter.getValue());
                    System.out.println(sudokuBoard);
                    System.out.println(enter.getValue() + " was added to board.");
                }
            }
        }
    }
}

