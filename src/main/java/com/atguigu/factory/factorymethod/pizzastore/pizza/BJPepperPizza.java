package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("prepare for BJPepperPizza");
    }
}
