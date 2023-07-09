package com.atguigu.factory.abstfactory.pizzastore.order;

import java.io.IOException;

public class PizzaStore {
    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
