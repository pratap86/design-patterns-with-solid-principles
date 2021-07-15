package com.pratap.designpatterns.behaviour.observer;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Or;

import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {

    @Test
    void testPriceObserver_When_Total_Is_GreaterThanOrEqualTo200(){

        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);
        order.addItem(200);
        assertEquals(10.0, order.getDiscount());
    }

    @Test
    void testPriceObserver_When_Total_Is_GreaterThanOrEqualTo500(){

        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        order.attach(priceObserver);
        order.addItem(500);
        assertEquals(20.0, order.getDiscount());
    }

    @Test
    void testQuantityObserver_When_CountIsUptoFive(){
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(200);
        assertEquals(20.0, order.getDiscount());
        assertEquals(10.0, order.getShippingCost());
        System.out.println(order);
    }

    @Test
    void testQuantityObserver_When_CountIsUptoTen(){
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(200);
        assertEquals(20.0, order.getDiscount());
        assertEquals(17.5, order.getShippingCost());
    }

    @Test
    void testQuantityObserver_When_CountMoreThanTen(){
        Order order = new Order("100");
        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        order.attach(priceObserver);
        order.attach(quantityObserver);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(200);
        assertEquals(20.0, order.getDiscount());
        assertEquals(25.0, order.getShippingCost());
    }
}