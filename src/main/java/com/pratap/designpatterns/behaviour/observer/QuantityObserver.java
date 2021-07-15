package com.pratap.designpatterns.behaviour.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        int count = order.getCount();
        if (count <= 5){
            order.setShippingCost(10);
        } else if (count > 5 && count <= 10){
            order.setShippingCost(10 + (count - 5) * 1.5);
        } else if (count > 10 && count <= 20){
            order.setShippingCost(10 + (count - 5) * 2.5);
        }
    }
}
