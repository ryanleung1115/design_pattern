package com.atguigu.factory.abstfactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for GreekPizza");
    }
}
