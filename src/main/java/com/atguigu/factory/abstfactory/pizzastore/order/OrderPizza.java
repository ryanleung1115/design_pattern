package com.atguigu.factory.abstfactory.pizzastore.order;

import com.atguigu.factory.abstfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) throws IOException {
        setAbsFactory(absFactory);
    }

    public void setAbsFactory(AbsFactory absFactory) throws IOException {
        Pizza pizza=null;
        String orderType="";

        this.absFactory = absFactory;

        do {
            orderType=getType();
            pizza=this.absFactory.createPizza(orderType);

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
