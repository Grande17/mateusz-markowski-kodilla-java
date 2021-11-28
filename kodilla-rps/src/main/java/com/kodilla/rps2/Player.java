package com.kodilla.rps2;

import java.util.Scanner;

public class Player {
    private String playerName;
    private Scanner sc = new Scanner(System.in);
    private int numberOfGames;
    private int playerChoice;
    private String playAgainOrQuit;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName() {
        this.playerName = sc.nextLine();
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames() {
        while(!sc.hasNextInt()){
            System.out.println("Input is not a number.");
            sc.nextLine();
        }
        this.numberOfGames = sc.nextInt();

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

    public String getPlayAgainOrQuit() {
        return playAgainOrQuit;
    }

    public void setPlayAgainOrQuit() {
        String value = sc.next();
        if(value.equalsIgnoreCase("Y")|| value.equalsIgnoreCase("N")){
            this.playAgainOrQuit = value;
        }else{
            System.out.println("Please type Y on N!!!");
            setPlayAgainOrQuit();
        }

    }
}
