package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer{


    private Map<Product, Integer> newProductsList(){
        Map<Product,Integer> gfs = new HashMap<>();
        gfs.put(new GlutenFreeProducts("Oats"), 75);
        gfs.put(new GlutenFreeProducts("Chocolate"), 25);
        gfs.put(new GlutenFreeProducts("Rice"), 100);
        return gfs;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> order) {
        return ifAvailable(order);
    }

    public boolean ifAvailable(Map<Product, Integer> list){
        for (Map.Entry<Product, Integer> my : list.entrySet()){
            if (my.getValue() <= 25){
                System.out.println("We are currently low on stock");
                return false;
            }
        }
        return true;
    }

}
