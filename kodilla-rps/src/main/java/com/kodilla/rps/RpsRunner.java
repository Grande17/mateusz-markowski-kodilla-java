package com.kodilla.rps;



public class RpsRunner {
    public static void main(String[] args) {
        Player player = new Player();
        MessagesBoard messagesBoard = new MessagesBoard();
        Computer computer = new Computer();
        GameConditions gameConditions = new GameConditions();
        boolean end = false;


        messagesBoard.welcomeMessage();//Welcome message
        player.setPlayerName();//Set player name
        player.setNumberOfWonGamesToEnd();//Set number of games to win
        while (!end) {
            messagesBoard.guiMessage();//Message showing possible choices
            player.setPlayerChoice();//player set the choice
            player.playerChoiceConditions(player.getPlayerChoice());// printing out the playr choice
            computer.setRandom();//computer genereting int 1-3
            computer.computerChoice();// sout computers choice
            gameConditions.victoryConditions(player.getPlayerChoice(), computer.getRandom());//checking the game conditions

            if (player.getNumberOfWonGamesToEnd() == gameConditions.computerWon) {
                messagesBoard.defeatMessage();
                end = true;
            } else if (player.getNumberOfWonGamesToEnd() == gameConditions.playerWon) {
                messagesBoard.victoryMessage();
                end = true;
            }
        }
        messagesBoard.playAgainOrQuitMessage();
        player.setAgain();
        if (player.getAgain().equalsIgnoreCase("Y")) {
            System.out.println("Starting again!");
            main(args);
        } else if (player.getAgain().equalsIgnoreCase("N")) {
            System.out.println("Quiting");
            System.exit(0);
        }

    }
}
