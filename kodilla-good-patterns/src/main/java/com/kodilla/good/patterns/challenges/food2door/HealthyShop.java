package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer{


    private Map<Product, Integer> newProductsList(){
        Map<Product, Integer> hsProductsList = new HashMap<>();

        hsProductsList.put(new HealthyFood("Almonds"), 50);
        hsProductsList.put(new HealthyFood("Chia seeds"), 200);
        hsProductsList.put(new HealthyFood("Coconuts"), 75);
        return hsProductsList;
    }


    @Override
    public boolean process(Customer costumer, Map<Product, Integer> order) {
        if (costumer.equals("CarnacShop") || ifOnStock(order)){
            System.out.println("We are sorry but we are not cooperating with our market competition");
            return false;
        }
        return true;
    }

    private boolean ifOnStock(Map<Product, Integer> orders){
        for (Map.Entry<Product, Integer> my : orders.entrySet()){
            if (my.getValue() == 0){
                System.out.println("Product is temporarily not available");
                return false;
            }
        }
        return true;
    }
}
