package com.kodilla.sudoku;

import java.util.List;
import java.util.stream.Collectors;

public class SudokuResolve {
    private SudokuBoard board;

    public SudokuResolve(SudokuBoard board) {
        this.board = board;
    }

    public void resolve() {
        ElementAdder elementAdder = new ElementAdder(board);
        EndGameChecker endGameChecker = new EndGameChecker(board);
        boolean anyOperation = false;

        while (!endGameChecker.isEndGame()) {
            for (int y = 1; y < 10; y++) {
                for (int x = 1; x < 10; x++) {
                    SudokuElement element = board.getBoard().get(y - 1).getRow().get(x - 1);
                    if (element.getValue() == 0) {
                        if (element.getPossibilities().size() == 1) {
                            int toPut = element.getPossibilities().get(0);
                            elementAdder.add(x, y, toPut);
                            anyOperation = true;
                        } else {
                            int s = 0;
                            for (int r = element.getPossibilities().get(s); s < element.getPossibilities().size(); s++) {
                                List<Integer> list = board.getBoard().get(y - 1).getRow().stream()
                                        .flatMap(e -> e.getPossibilities().stream())
                                        .filter(e -> e.equals(r))
                                        .collect(Collectors.toList());
                                if (list.size() == 1) {
                                    elementAdder.add(x, y, r);
                                    anyOperation = true;
                                }
                            }
                        }
                    }
                }
            }
            if (!anyOperation) {
                GuessNumber guessNumber = new GuessNumber(board);
                anyOperation = guessNumber.guess();
            }
            System.out.println(board);
        }

    }
}

