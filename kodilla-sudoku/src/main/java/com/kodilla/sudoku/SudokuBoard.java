package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
    }

    public void createBoard(){
        for (int i = 0;i<9;i++){
            sudokuBoard.add(new SudokuRow());
        }
        for (SudokuRow row: sudokuBoard) {
            row.createEmptyRow();

        }
    }
    public void setValueToCell(int x, int y, int val){
        sudokuBoard.get(x-1).getSudokuRow().set(y-1,new SudokuElement(val));
    }
    public boolean checkRow(int row, int val){
        for (int i =0;i<9; i++){
            if (val == sudokuBoard.get(i).getSudokuRow().get(getSudokuBoard().size()).getValue()){
                return true;
            }
        }
        return false;
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();

       for (int i = 0; i<8; i++){
           builder.append(" | ");
           for (int j=0; j<=8; j++){
               if (sudokuBoard.get(i).getSudokuRow().get(j).getValue() == -1){
                   builder.append(" - ");
               }else{
                   builder.append(" ");
                   builder.append(sudokuBoard.get(i).getSudokuRow().get(j).getValue());
                   builder.append(" ");
               }
               builder.append(" | ");
           }
       }
       return builder.toString();
    }
}
