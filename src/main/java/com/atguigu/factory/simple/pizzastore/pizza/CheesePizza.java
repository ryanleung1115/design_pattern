package com.atguigu.factory.simple.pizzastore.pizza;

public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("prepare for CheesePizza");
    }
}
