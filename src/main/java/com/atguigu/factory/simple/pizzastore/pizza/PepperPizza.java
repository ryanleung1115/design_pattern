package com.atguigu.factory.simple.pizzastore.pizza;

public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare for PepperPizza");
    }
}
