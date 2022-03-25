package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    public static final int EMPTY = -1;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibleValues() {
        for (int i =1; i<=9;i++){
            possibleValues.add(i);
        }
        return possibleValues;
    }
}
