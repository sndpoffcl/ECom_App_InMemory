package com.salesSky.SalesEComApp.service;

import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.entity.Order;

import java.util.List;

public interface CustomerService {
    Customer getCustomerDetails(int customerId);
    Customer saveCustomerDetails(Customer customer);
    List<Customer> getAllCustomer();
    List<Order> getAllOrderByCustomer(int customerId);
    List<Customer> getAllCustomerAboveOrders(int numberOfOrders);
}
