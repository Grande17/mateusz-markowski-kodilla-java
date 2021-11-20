package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private Scanner sc = new Scanner(System.in);
    private String computer;
    private Random randomiser = new Random();
    private int random;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = randomiser.nextInt(3)+1;
    }

    public void computerChoice(){
        computer = "";
        if (random == 1) {
            computer = "Rock";
        }else if(random == 2){
            computer = "Paper";
        }else if(random == 3){
            computer = "Scissors";
        }
        System.out.println("Computer choice was "+computer);
    }
}
