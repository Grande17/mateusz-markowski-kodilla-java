package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class OrderRequest {
    private Customer customer;
    private Producer producer;
    private Map<Product, Integer> productRequest;

    public OrderRequest(Customer customer, Producer producer, Map<Product, Integer> productRequest) {
        this.customer = customer;
        this.producer = producer;
        this.productRequest = productRequest;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Producer getProducer() {
        return producer;
    }

    public Map<Product, Integer> getProductRequest() {
        return productRequest;
    }
}
