package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private Product product;
    private LocalDateTime date;
    private int qty;

    public OrderRequest(User user, Product product, LocalDateTime date, int qty) {
        this.user = user;
        this.product = product;
        this.date = date;
        this.qty = qty;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getQty() {
        return qty;
    }
}
