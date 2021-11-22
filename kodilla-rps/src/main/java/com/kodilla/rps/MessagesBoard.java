package com.kodilla.rps;

public class MessagesBoard {
    public void welcomeMessage(){
        System.out.println("Welcome to:\n" +
                "Rock Paper Scissors Game!\n" +
                "");
    }
    public void guiMessage(){
        System.out.println("If you want to choose: \n" +
                "Rock press 1\n" +
                "Paper press 2\n" +
                "Scissors press 3\n");
    }
    public void victoryMessage(){
        System.out.println("Congratulations, you won!");
    }
    public void defeatMessage(){
        System.out.println("We're so sorry but you lost");
    }
    public void playAgainOrQuitMessage(){
        System.out.println("Do you want to play again?\n" +
                "Press Y to play again.\n" +
                "Press N to quit the game.");
    }

}
