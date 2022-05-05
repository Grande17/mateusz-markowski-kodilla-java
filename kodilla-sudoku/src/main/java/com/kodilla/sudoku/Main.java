package com.kodilla.sudoku;

public class Main {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while(!gameFinished){
            Controller controller = new Controller();
            gameFinished = controller.resolve();
        }



    }
}
