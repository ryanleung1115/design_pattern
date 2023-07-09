package com.atguigu.factory.simple.pizzastore.order;

import com.atguigu.factory.simple.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simple.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simple.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simple.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory) throws IOException {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) throws IOException {
        String orderType="";

        this.simpleFactory = simpleFactory;

        do {
            orderType=getType();
            pizza=this.simpleFactory.createPizza(orderType);

            if (pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("fail to order pizza");
                break;
            }
        }while (true);
    }

    private String getType() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input pizza type:");
        String str = reader.readLine();
        return str;
    }
}
