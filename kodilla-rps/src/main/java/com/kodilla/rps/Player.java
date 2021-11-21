package com.kodilla.rps;

import java.util.Locale;
import java.util.Scanner;

public class Player {
    private Scanner sc = new Scanner(System.in);
    private String playerName;
    private int numberOfWonGamesToEnd;
    private int playerChoice;
    public String again;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        System.out.println("Please set player name: ");
        this.playerName = sc.nextLine();
    }

    public int getNumberOfWonGamesToEnd() {
        return numberOfWonGamesToEnd;
    }

    public void setNumberOfWonGamesToEnd(int numberOfWonGamesToEnd) {
        System.out.println("Set number of games you want to play to win: ");
        this.numberOfWonGamesToEnd = sc.nextInt();
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = sc.nextInt();
    }

    public String getAgain() {
        return again;
    }

    public void setAgain(String again) {
        this.again = sc.nextLine();
    }

    public void playerChoiceConditions(int playerChoice){
        String player = "";
        if(playerChoice == 1){
            player = "Rock";
        }else if(playerChoice == 2){
            player = "Paper";
        }else if(playerChoice == 3){
            player = "Scissors";
        }
        System.out.println("Your choice was "+ player);
    }

}
