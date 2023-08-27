package com.peterschmidt.orderservice.model;

import java.util.List;

public class Order {
    private int id;
    private List<String> products;
    private double totalPrice;

    public Order(int id, List<String> products, double totalPrice) {
        this.id = id;
        this.products = products;
        this.totalPrice = totalPrice;
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