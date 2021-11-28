package com.kodilla.rps2;

public class RpsRunner {
    public static void main(String[] args) {
        MessageBoard messageBoard = new MessageBoard();
        Player player = new Player();
        Computer computer = new Computer();
        GameLogic gameLogic = new GameLogic();
        Turn computerChoice;
        Turn playerChoice;
        boolean end = false;
        boolean end2 = false;

        messageBoard.welcomeMessage();
        player.setPlayerName();
        while(!end2) {
            messageBoard.numberOfGamesToWinMessage();
            player.setNumberOfGames();
            while (!end) {

                messageBoard.guiMessage();
                player.setPlayerChoice();
                computer.setComputerChoice();
                playerChoice = gameLogic.choice(computer.getComputerChoice());
                messageBoard.playerChoice(playerChoice.getName());
                computerChoice = gameLogic.choice(player.getPlayerChoice());
                messageBoard.computerChoice(computerChoice.getName());
                gameLogic.checkWinner(playerChoice, computerChoice);
                gameLogic.statistics();

                if (gameLogic.getComputerWon() == player.getNumberOfGames()) {
                    messageBoard.defeatMessage();
                    end = true;
                } else if (gameLogic.getPlayerWon() == player.getNumberOfGames()) {
                    messageBoard.victoryMessage();
                    end = true;
                }

            }
            messageBoard.playAgainOrQuit();
            player.setPlayAgainOrQuit();
            if (player.getPlayAgainOrQuit().equalsIgnoreCase("Y")) {
                end = false;
                System.out.println("Starting again...");
            }else if(player.getPlayAgainOrQuit().equalsIgnoreCase("N")){
                System.out.println("Quiting!");
                System.exit(0);
            }
        }
    }
}
