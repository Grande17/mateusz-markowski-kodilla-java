package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRetriever {
    public List<OrderRequest> retrieve(){
        List<OrderRequest> orderRequests = new ArrayList<>();

        Customer customer = new Customer("Mateusz");
        Producer producer = new ExtraFoodShop();

        Map<Product, Integer> efs = new HashMap<>();
        efs.put(new MeatProducts("Beef"),3);
        efs.put(new MeatProducts("Lamb"), 2);
        orderRequests.add(new OrderRequest(customer,producer,efs));

        Customer customer1 = new Customer("Patrick");
        Producer producer1 = new GlutenFreeShop();
        Map<Product, Integer> gfs = new HashMap<>();

        gfs.put(new GlutenFreeProducts("Oats"), 15);
        gfs.put(new GlutenFreeProducts("Chocolate"), 10);
        orderRequests.add(new OrderRequest(customer1,producer1,gfs));

        return orderRequests;

    }
}
