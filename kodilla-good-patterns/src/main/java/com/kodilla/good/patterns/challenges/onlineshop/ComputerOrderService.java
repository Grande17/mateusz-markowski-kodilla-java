package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class ComputerOrderService implements OrderService{
    @Override
    public boolean sell(User user, LocalDateTime orderDate, Product product, int qty) {
        return true;
    }
}
