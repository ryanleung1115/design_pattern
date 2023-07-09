package com.atguigu.factory.abstfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("prepare for LDPepperPizza");
    }
}
