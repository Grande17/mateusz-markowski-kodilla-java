package com.kodilla.good.patterns.challenges.onlineshop;


import java.time.LocalDateTime;

public interface OrderService {
    boolean sell(User user, LocalDateTime orderDate, Product product, int qty);
}
