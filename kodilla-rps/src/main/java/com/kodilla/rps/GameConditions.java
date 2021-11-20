package com.kodilla.rps;

public class GameConditions {
    Player player;
    Computer computer;
    private int play;
    private int comp;
    int gameNumber = 0;
    int computerWon = 0;
    int playerWon = 0;

    public int getPlay() {
        return play;
    }

    public int getComp() {
        return comp;
    }

    public void setPlay(int play) {
        this.play = player.getPlayerChoice();
    }

    public void setComp(int comp) {
        this.comp = computer.getRandom();
    }

    public void victoryConditions(int play, int comp) {
        if (play == comp) {
            gameNumber++;
            System.out.println("DRAW \n" +
                    "You win: "+playerWon+"\n" +
                    "Total computer wins: "+ computerWon+"\n" +
                    "Total number of games: "+gameNumber);
            System.out.println();
        } else if (play == 1 && comp == 2 || // Computer victory
                play == 2 && comp == 3 ||
                play == 3 && comp == 1) {
            computerWon++;
            gameNumber++;
            System.out.println("Computer won. \n" +
                    "You win: "+ playerWon+"\n"+
                    "Total computer wins: " + computerWon + "\n" +
                    "Total number of games: " + gameNumber);
            System.out.println();
        } else if (comp == 1 && play == 2 ||
                comp == 2 && play == 3 ||
                comp == 3 && play == 1) {
            playerWon++;
            gameNumber++;
            System.out.println("You won.\n" +
                    "You win: " + playerWon + "\n" +
                    "Total computer wins: "+ computerWon+"\n"+
                    "Total number of games: " + gameNumber);
            System.out.println();
        }
    }
}
