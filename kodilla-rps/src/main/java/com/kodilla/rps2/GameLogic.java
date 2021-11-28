package com.kodilla.rps2;

public class GameLogic {
    private Rock r = new Rock();
    private Paper p = new Paper();
    private Scissors s = new Scissors();
    private Turn result;
    private int playerWon = 0;
    private int computerWon = 0;
    private int numberOfGames = 0;
    private Result gameResult;

   public Turn choice(int choice){
       if(choice == 1){
           result = r;
       }else if(choice == 2){
           result = p;
       }else if(choice == 3){
           result = s;
       }
       return result;
   }
   public Result checkWinner(Turn playerChoice, Turn computerChoice){
       gameResult = null;
       if(playerChoice.equals(r)){
           r.result(computerChoice);
           gameResult = r.getGameResult();
       }else if(playerChoice.equals(p)){
           p.result(computerChoice);
           gameResult = p.getGameResult();
       }else if(playerChoice.equals(s)){
           s.result(computerChoice);
           gameResult = s.getGameResult();
       }
       return gameResult;

   }
   public void statistics(){
       if(gameResult.equals(Result.WIN)){
           playerWon++;
           numberOfGames++;
           System.out.println("You won!\n" +
                   "You won: "+playerWon+"/"+numberOfGames+"\n" +
                   "Computer won: "+computerWon+"/"+numberOfGames );
       }
       else if(gameResult.equals(Result.LOSE)){
           computerWon++;
           numberOfGames++;
           System.out.println("Computer won!\n" +
                   "You won: "+playerWon+"/"+numberOfGames+"\n" +
                   "Computer won: "+computerWon+"/"+numberOfGames );
       }else if(gameResult.equals(Result.DRAW)){
           numberOfGames++;
           System.out.println("DRAW!\n" +
                   "You won: "+playerWon+"/"+numberOfGames+"\n" +
                   "Computer won: "+computerWon+"/"+numberOfGames );
       }

   }

    public int getPlayerWon() {
        return playerWon;
    }

    public int getComputerWon() {
        return computerWon;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }
}
