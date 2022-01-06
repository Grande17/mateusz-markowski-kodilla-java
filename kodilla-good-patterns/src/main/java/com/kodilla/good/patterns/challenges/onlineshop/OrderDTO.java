package com.kodilla.good.patterns.challenges.onlineshop;

import java.time.LocalDateTime;

public class OrderDTO {
    private User user;
    private Product product;
    private LocalDateTime dateOfOrder;
    private int qty;
    private boolean isSold;

    public OrderDTO(User user, Product product, LocalDateTime dateOfOrder, int qty, boolean isSold) {
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
        this.qty = qty;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }

    public int getQty() {
        return qty;
    }

    public boolean isSold() {
        return isSold;
    }
}
