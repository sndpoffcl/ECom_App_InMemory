package com.salesSky.SalesEComApp.entity;

import lombok.Data;

@Data
public class Order {
    private int id;
    private Customer customer;
    private Product product;
    private double totalAmount;
    private String status;
    private String orderDate;

    public Order(int id, Customer customer, Product product, double totalAmount, String status, String orderDate) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
    }

    public Order(){

    }
}
