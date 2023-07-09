package com.atguigu.factory.abstfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("prepare for LDCheesePizza");
    }
}
