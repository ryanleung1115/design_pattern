package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("prepare for BJCheesePizza");
    }
}
