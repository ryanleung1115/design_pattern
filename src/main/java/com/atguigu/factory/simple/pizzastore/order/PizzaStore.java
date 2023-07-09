package com.atguigu.factory.simple.pizzastore.order;

import java.io.IOException;

public class PizzaStore {
    public static void main(String[] args) throws IOException {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
