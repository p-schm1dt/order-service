package com.peterschmidt.orderservice.model;

import java.util.List;

public class Order {
    private int id;

    private int customerId;
    private List<String> products;
    private double totalPrice;

    public Order(int id, int customerId, List<String> products, double totalPrice) {
        this.id = id;
        this.customerId = customerId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}