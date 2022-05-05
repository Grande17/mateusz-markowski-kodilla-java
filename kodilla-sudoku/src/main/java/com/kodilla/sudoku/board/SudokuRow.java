package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.board.SudokuElement.EMPTY;

public class SudokuRow {
    private List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow() {
    }

    public List<SudokuElement> getEmptySudokuRow() {
        for(int i =1; i<=9; i++){
            sudokuRow.add(new SudokuElement(EMPTY));
        }
        return new ArrayList<>(sudokuRow);
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }
}
