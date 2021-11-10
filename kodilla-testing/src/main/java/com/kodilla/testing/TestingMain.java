package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int add = calculator.add(9,9);
        int sub = calculator.sub(18,9);
        if(add == 18){
            System.out.println("test ok");
        }
        else{
            System.out.println("error");
        }
        if(sub == 9){
            System.out.println("test ok");
        }
        else{
            System.out.println("error");
        }


    }
}
