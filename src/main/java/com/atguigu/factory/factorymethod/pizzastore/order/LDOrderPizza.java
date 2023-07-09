package com.atguigu.factory.factorymethod.pizzastore.order;

import com.atguigu.factory.factorymethod.pizzastore.pizza.*;

import java.io.IOException;

public class LDOrderPizza extends OrderPizza{
    public LDOrderPizza() throws IOException {
    }

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;

        if(orderType.equals("cheese")){
            pizza=new LDCheesePizza();
        }else if(orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}
