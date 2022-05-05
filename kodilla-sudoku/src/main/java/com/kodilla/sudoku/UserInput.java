package com.kodilla.sudoku;

import java.util.Scanner;

public class UserInput {
    private Scanner sc = new Scanner(System.in);

    public String getCoordinatesAndValueForInput(){
        System.out.println("Please insert your choice! Example '111'.");
        String result = sc.nextLine();
        while(!result.matches("-?[1-9]{3}")){
            System.out.println("Wrong input. Type 3 numbers between 1-9");
            result = sc.nextLine();
        }
        return result;

    }
}
