package com.atguigu.factory.trad.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare for GreekPizza");
    }
}
