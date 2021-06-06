package com.salesSky.SalesEComApp.entity;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private String category;
    private int price;
    private int quantity;
    private boolean IsActive;

    public Product(int id, String name, String category, int price, int quantity, boolean isActive) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        IsActive = isActive;
    }

    public Product() {
    }
}
