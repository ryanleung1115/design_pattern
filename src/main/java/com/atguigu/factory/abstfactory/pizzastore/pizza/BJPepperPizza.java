package com.atguigu.factory.abstfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("prepare for BJPepperPizza");
    }
}
