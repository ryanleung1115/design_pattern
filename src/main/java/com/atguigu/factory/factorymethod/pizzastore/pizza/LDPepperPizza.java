package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("prepare for LDPepperPizza");
    }
}
