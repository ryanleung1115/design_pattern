package com.atguigu.factory.trad.pizzastore.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare for CheesePizza");
    }
}
