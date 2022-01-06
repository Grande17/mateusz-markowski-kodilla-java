package com.kodilla.good.patterns.challenges.onlineshop;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest request(){
        User user = new User("Mateusz", "Markowski");
        Product product = new Product("Pen", BigDecimal.valueOf(2.5));
        LocalDateTime date = LocalDateTime.of(2022,1,6,11,17);
        int qty = 10;

        return new OrderRequest(user,product,date,qty);
    }

}
