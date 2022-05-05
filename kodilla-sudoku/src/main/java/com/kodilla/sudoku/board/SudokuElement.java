package com.kodilla.sudoku.board;


public class SudokuElement {
    public static int EMPTY = -1;
    private int value;

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
