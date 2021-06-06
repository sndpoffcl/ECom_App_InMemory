package com.salesSky.SalesEComApp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Customer {
    private int id;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String address;
    private List<Order> orderList;

    public Customer(int id, String name, String emailId, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderList = new ArrayList<>();
    }

    public Customer(){

    }
}
