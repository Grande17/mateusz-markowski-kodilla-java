package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final List<SudokuElement> sudokuRow = new ArrayList<>();

    public List<SudokuElement> createEmptyRow(){
        for (int i=0;i<9;i++){
            sudokuRow.add(new SudokuElement(SudokuElement.EMPTY));
        }
        return new ArrayList<>(sudokuRow);
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }


}
