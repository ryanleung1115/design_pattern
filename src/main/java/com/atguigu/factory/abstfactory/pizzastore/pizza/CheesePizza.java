package com.atguigu.factory.abstfactory.pizzastore.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare for CheesePizza");
    }
}
