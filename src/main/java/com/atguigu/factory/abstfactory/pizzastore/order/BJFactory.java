package com.atguigu.factory.abstfactory.pizzastore.order;

import com.atguigu.factory.abstfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.abstfactory.pizzastore.pizza.BJPepperPizza;
import com.atguigu.factory.abstfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;

        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}
