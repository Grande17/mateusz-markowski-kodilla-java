package com.kodilla.rps2;

public class Rock implements Turn{
    private Result gameResult;

    @Override
    public Features getName() {
        return Features.ROCK;
    }

    public Result getGameResult() {
        return gameResult;
    }

    @Override
    public void result(Turn a) {
        if(a.getName() == Features.SCISSORS){
            gameResult = Result.WIN;
        }else if(a.getName() == Features.ROCK){
            gameResult = Result.DRAW;
        }else if(a.getName() == Features.PAPER){
            gameResult = Result.LOSE;
        }

    }
}
