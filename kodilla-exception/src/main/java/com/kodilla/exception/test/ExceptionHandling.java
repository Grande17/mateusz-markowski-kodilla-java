package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "";
        try {
            result = secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception x) {
            System.out.println("Exception: " + x);
        }
        finally {
            System.out.println(result);
        }
    }
}
