package com.kodilla.rps2;

public class Paper implements Turn{
    private Result gameResult;

    @Override
    public Features getName() {
        return Features.PAPER;
    }

    public Result getGameResult() {
        return gameResult;
    }

    @Override
    public void result(Turn a) {
        if(a.getName() == Features.ROCK){
            gameResult = Result.WIN;
        }else if(a.getName() == Features.PAPER){
            gameResult = Result.DRAW;
        } else if (a.getName() == Features.SCISSORS) {
            gameResult = Result.LOSE;
        }
    }
}
