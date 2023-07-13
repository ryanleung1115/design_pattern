package com.heima.proxy.static_;

public class TrainStation implements ISellTicket{

    @Override
    public void sell() {
        System.out.println("train sells ticket");
    }
}
