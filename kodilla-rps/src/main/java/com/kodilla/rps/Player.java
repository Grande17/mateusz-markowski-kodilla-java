package com.kodilla.rps;

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

    public void setPlayerName() {
        System.out.println("Please set player name: ");
        this.playerName = sc.nextLine();
    }

    public int getNumberOfWonGamesToEnd() {
        return numberOfWonGamesToEnd;
    }

    public void setNumberOfWonGamesToEnd() {
        System.out.println("Set number of games you want to play to win: ");
        while(!sc.hasNextInt()){
            System.out.println("Input is not a number.");
            sc.nextLine();
        }
        this.numberOfWonGamesToEnd = sc.nextInt();
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice() {
        String valueOfString = sc.next();
        if (valueOfString.equals("1") || valueOfString.equals("2") || valueOfString.equals("3")) {
            this.playerChoice = Integer.valueOf(valueOfString);
        } else {
            System.out.println("Please, type 1, 2 or 3!!!");
            setPlayerChoice();
        }
    }

    public String getAgain() {
        return again;
    }

    public void setAgain() {
        String value = sc.next();
        if(value.equalsIgnoreCase("Y") || value.equalsIgnoreCase("N")){
            this.again = value;
        }
        else{
            System.out.println("Please, type Y or N!");
            setAgain();
        }
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
