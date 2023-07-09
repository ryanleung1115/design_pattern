package com.atguigu.factory.abstfactory.pizzastore.order;

import com.atguigu.factory.abstfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
