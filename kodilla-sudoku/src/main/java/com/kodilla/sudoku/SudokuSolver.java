package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;

public class SudokuSolver {
    private SudokuBoard backtrackSudokuBoard;

    public SudokuSolver(SudokuBoard board) throws CloneNotSupportedException{
        this.backtrackSudokuBoard = board.deepCopy();
    }
    private boolean valueIsPossibleInLine(int x, int y, int val){
        for (int i = 1; i <=9; i++ ){
            if (backtrackSudokuBoard.getSudokuBoard().get(i).getSudokuRow().get(y).getValue() == val ||
            backtrackSudokuBoard.getSudokuBoard().get(x).getSudokuRow().get(i).getValue() == val){
                return false;
            }
        }
        return true;
    }
    private boolean valueIsPossibleInField(int x, int y, int val){
        int X = x - x%3;
        int Y = y - y%3;
        for (int i = 1; i <=3; i++){
            for (int j = 1; j<=3; j++){
                if (backtrackSudokuBoard.getSudokuBoard().get(x).getSudokuRow().get(Y+j).getValue() == val){
                    return false;
                }
            }

        }
        return true;
    }
    private boolean validate(int x, int y, int val){
        return valueIsPossibleInLine(x,y,val) && valueIsPossibleInField(x,y,val);
    }
    public boolean solveField(int x, int y){
        for (int i =1; i<=9; i++){
            if (validate(x,y,i)){
                backtrackSudokuBoard.getSudokuBoard().get(x).getSudokuRow().get(y).setValue(i);
                if(solveBoard()){
                    return true;
                }
                backtrackSudokuBoard.getSudokuBoard().get(x).getSudokuRow().get(y).setValue(-1);
            }
        }
        return true;
    }

    private boolean solveBoard(){
        for (int i =1; i<=9; i++){
            for (int j =1; j<=9; j++){
                if (elementIsEmpty(i,j)){
                    return solveField(i,j);
                }
            }
        }
        return true;
    }

    private boolean elementIsEmpty(int x, int y){
        return backtrackSudokuBoard.getSudokuBoard().get(x).getSudokuRow().get(y).getValue() == -1;
    }

    public SudokuBoard solve() throws CloneNotSupportedException {
       if (!solveBoard()){
           throw new IllegalArgumentException("It's not possible to solve");
       }
       return backtrackSudokuBoard.deepCopy();
    }

}
