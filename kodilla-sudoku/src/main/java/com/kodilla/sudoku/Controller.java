package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Scanner;

public class Controller {
    private SudokuBoard board = new SudokuBoard();
    private Scanner sc = new Scanner(System.in);
    private UserInput input = new UserInput();

    private void fill(){
        System.out.println("Welcome");
        System.out.println(board);
        String get = input.getCoordinatesAndValueForInput();
        board.insertDataToSudoku(Character.getNumericValue(get.charAt(0)),
                Character.getNumericValue(get.charAt(1)),
                Character.getNumericValue(get.charAt(2)));
        System.out.println(board);

    }
    private void solveGame(){
        do{
            System.out.println("Type 'SUDOKU' to get solution");
        }while(!sc.nextLine().equals("SUDOKU"));

        try{
            SudokuSolver solver = new SudokuSolver(board);
            SudokuBoard result = solver.solve();
            System.out.println(result);
        }catch (CloneNotSupportedException e){
            System.out.println(e.getStackTrace());
        }

    }
    public boolean resolve(){
        board.createSudokuBoard();
        fill();
        solveGame();
        return true;
    }
}
