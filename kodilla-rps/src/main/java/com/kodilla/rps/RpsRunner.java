package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Player player = new Player();
        MessagesBoard messagesBoard = new MessagesBoard();
        Computer computer = new Computer();
        GameConditions gameConditions = new GameConditions();
        boolean end = false;


        messagesBoard.welcomeMessage();//Welcome message
        player.setPlayerName(player.getPlayerName());//Set player name
        player.setNumberOfWonGamesToEnd(player.getNumberOfWonGamesToEnd());//Set number of games to win
        while(!end) {
            messagesBoard.guiMessage();//Message showing possible choices
            player.setPlayerChoice(player.getPlayerChoice());//player set the choice
            player.playerChoiceConditions(player.getPlayerChoice());// printing out the playr choice
            computer.setRandom(computer.getRandom());//computer genereting int 1-3
            computer.computerChoice();// sout computers choice
            gameConditions.victoryConditions(player.getPlayerChoice(), computer.getRandom());//checking the game conditions

            if(player.getNumberOfWonGamesToEnd() == gameConditions.playerWon ||
                    player.getNumberOfWonGamesToEnd() == gameConditions.computerWon){
                end = true;
            }
            if(gameConditions.playerWon == player.getNumberOfWonGamesToEnd()){
                System.out.println("Congratulations you won the whole game!");
            }else if(gameConditions.computerWon == player.getNumberOfWonGamesToEnd()){
                System.out.println("Unfortunately you lost! Try to play some easier games! ");
            }

        }






    }
}
