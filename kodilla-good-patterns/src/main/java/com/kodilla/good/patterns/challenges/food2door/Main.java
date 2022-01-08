package com.kodilla.good.patterns.challenges.food2door;

public class Main {
    public static void main(String[] args) {
        OrderProcess orderProcess = new OrderProcess();
        orderProcess.processAll(new OrderRetriever().retrieve());
    }
}
