package com.kodilla.patterns.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {

    private final String bottom;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class PizzaBuilder {
        private String bottom;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public PizzaBuilder bottom(String bottom) {
            this.bottom = bottom;
            return this;
        }

        public PizzaBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Pizza build() {
            return new Pizza(bottom, sauce, ingredients);
        }
    }

    private Pizza(final String bottom, final String sauce, List<String> ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBottom() {
        return bottom;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bottom='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (bottom != null ? !bottom.equals(pizza.bottom) : pizza.bottom != null) return false;
        if (sauce != null ? !sauce.equals(pizza.sauce) : pizza.sauce != null) return false;
        return ingredients != null ? ingredients.equals(pizza.ingredients) : pizza.ingredients == null;
    }

    @Override
    public int hashCode() {
        int result = bottom != null ? bottom.hashCode() : 0;
        result = 31 * result + (sauce != null ? sauce.hashCode() : 0);
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        return result;
    }
}
