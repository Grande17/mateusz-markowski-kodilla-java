package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype{
    public static int MIN = 1;
    public static int MAX = 9;
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
    }

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public void createSudokuBoard(){
        for (int i =1; i<=9; i++){
            sudokuBoard.add(new SudokuRow());
        }
        for(SudokuRow row: sudokuBoard){
            row.getEmptySudokuRow();
        }
    }
    public void insertDataToSudoku(int x, int y, int value){
        sudokuBoard.get(x).getSudokuRow().set(y, new SudokuElement(value));
    }

    @Override
    public String toString() {
        StringBuilder board = new StringBuilder();
        board.append("--------------------\n");
        for (int i = MIN; i <= MAX; i++){
            board.append(" | ");
            for(int x = MIN; x <= MAX; x++){
                if(sudokuBoard.get(i).getSudokuRow().get(x).getValue() == -1){
                    board.append(" ");
                }else{
                    board.append(sudokuBoard.get(i).getSudokuRow().get(x).getValue());
                }
                board.append(" | ");
            }
            board.append("\n");
            board.append("--------------------\n");
        }
        return board.toString();
    }
    public SudokuBoard deepCopy() throws CloneNotSupportedException{
        SudokuBoard result = (SudokuBoard) super.clone();
        result.sudokuBoard = new ArrayList<>();
        for (SudokuRow row : sudokuBoard){
            SudokuRow backTrace = new SudokuRow();
            for(SudokuElement element: row.getSudokuRow()){
                backTrace.getSudokuRow().add(element);
            }
            result.getSudokuBoard().add(backTrace);
        }
        return result;
    }
}
