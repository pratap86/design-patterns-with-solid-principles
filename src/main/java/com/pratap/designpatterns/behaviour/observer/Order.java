package com.pratap.designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * A concrete Subject aka observable
 * @author Pratap Narayan
 */
public class Order {

    private String id;

    // cost of item
    private double itemCost;

    // no of items
    private int count;

    private double discount;

    private double shippingCost;

    private List<OrderObserver> observers = new ArrayList<>();

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }
    public Order(String id) {
        this.id = id;
    }

    // send out the notification when state changed happens
    public void addItem(double price){
        itemCost += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    public double getTotal(){
        return itemCost - discount + shippingCost;
    }

    public double getItemCost() {
        return itemCost;
    }

    public int getCount() {
        return count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", count=" + count +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
