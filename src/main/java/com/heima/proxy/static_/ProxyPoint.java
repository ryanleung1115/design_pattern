package com.heima.proxy.static_;

public class ProxyPoint implements ISellTicket {
    // composition
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("pay service charge to proxy point");
        trainStation.sell();
    }
}
