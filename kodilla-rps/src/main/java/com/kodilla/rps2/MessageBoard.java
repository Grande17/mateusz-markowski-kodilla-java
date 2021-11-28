package com.kodilla.rps2;

public class MessageBoard {
    public void welcomeMessage(){
        System.out.println("Welcome in Rock Paper Scissors Game!\n" +
                        "\n" +
                "Please enter your name:");
    }
    public void numberOfGamesToWinMessage(){
        System.out.println("Please set number of victories to win a game:");
    }
    public void guiMessage(){
        System.out.println("Please, set:\n" +
                "1 to chose ROCK\n" +
                "2 to chose PAPER\n" +
                "3 to chose SCISSORS\n" +
                "");
    }
    public void playerChoice(Features choice){
        System.out.println("Player choice was: "+choice);

    }
    public void computerChoice(Features choice){
        System.out.println("Computer choice was: "+choice);
    }
    public void victoryMessage(){
        System.out.println("Congratulations you WON the game!!!\n" +
                "");
    }
    public void defeatMessage(){
        System.out.println("Unfortunately you LOST!\n" +
                "");
    }
    public void playAgainOrQuit(){
        System.out.println("Do you want to play again?\n" +
                "Press Y to play again.\n" +
                "Press N to quit the game.\n" +
                "");
    }

}
