package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class ComputerOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(User user, LocalDateTime orderDate, Product product, int qty) {
        return true;
    }
}
