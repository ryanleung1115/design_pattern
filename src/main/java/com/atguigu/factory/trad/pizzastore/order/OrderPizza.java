package com.atguigu.factory.trad.pizzastore.order;

import com.atguigu.factory.trad.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.trad.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.trad.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.trad.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() throws IOException {
        Pizza pizza=null;
        String orderType;
        do{
            orderType=getType();
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
            else{
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = reader.readLine();
        return str;
    }
}
