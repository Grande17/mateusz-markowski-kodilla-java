package com.kodilla.good.patterns.challenges.food2door;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> newProductsList(){
        Map<Product,Integer> efsProductsList = new HashMap<>();

        efsProductsList.put(new MeatProducts("Beef"), 7);
        efsProductsList.put(new MeatProducts("Pork"), 15);
        efsProductsList.put(new MeatProducts("Goat Meat"), 8);
        efsProductsList.put(new MeatProducts("Lamb"), 3);

        return efsProductsList;
    }


    @Override
    public boolean process(Customer costumer, Map<Product, Integer> order) {
        for (Map.Entry<Product, Integer> my: order.entrySet()){
            if (my.getValue() == 0){
                System.out.println("We are out of stock, try later!");
                return false;
            }
        }
        return true;
    }
}
