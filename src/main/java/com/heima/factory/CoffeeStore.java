package com.heima.factory;

public class CoffeeStore {
    public Coffee orderCoffee(String name) {
        Coffee coffee = null;
        if (name.equals("expresso")) {
            coffee = new Espresso();
        } else if (name.equals("latte")) {
            coffee = new Latte();
        }

        return coffee;
    }
}
