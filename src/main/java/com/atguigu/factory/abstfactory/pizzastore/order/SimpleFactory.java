package com.atguigu.factory.abstfactory.pizzastore.order;

import com.atguigu.factory.abstfactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.abstfactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.abstfactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.abstfactory.pizzastore.pizza.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza=null;

        if(orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("greek pizza");
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("cheese pizza");
        }else if(orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("pepper pizza");
        }

        return pizza;
    }
}
