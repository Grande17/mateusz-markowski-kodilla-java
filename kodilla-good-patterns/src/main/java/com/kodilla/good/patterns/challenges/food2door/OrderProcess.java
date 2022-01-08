package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderProcess {

    public void processAll(List<OrderRequest> orderRequestList){
        orderRequestList.stream()
                .map(orderRequest -> {
                    System.out.println("Please wait " + orderRequest.getCustomer().getCustomerName());
                    return orderRequest.getProducer().process(orderRequest.getCustomer(), orderRequest.getProductRequest());
                })
                .forEach(x-> System.out.println("Order completed: " + x + "\n"));
    }
}
