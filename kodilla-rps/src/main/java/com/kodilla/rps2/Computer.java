package com.kodilla.rps2;

import java.util.Random;

public class Computer {
    private int computerChoice;
    private Random random = new Random();


    public int getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice() {
        this.computerChoice = random.nextInt(3)+1;
    }


}
