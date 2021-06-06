package com.salesSky.SalesEComApp.dao;

import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.entity.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerDAO {

    private static HashMap<Integer, Customer> customerData = new HashMap<>();

    public Customer saveCustomerDetails(Customer customer){
        customerData.put(customer.getId(), customer);
        return  customerData.get(customer.getId());
    }

    public Customer getCustomerDetails(int customerId){
        return customerData.get(customerId);
    }

    public List<Customer> getAllCustomer(){
        List<Customer> allCustomer = new ArrayList<>();
        for(Map.Entry<Integer,Customer> entry : customerData.entrySet()){
            allCustomer.add(entry.getValue());
        }
        return allCustomer;
    }

    public List<Customer> getCustomerDetails(String customerName){
        List<Customer> allCustomer = new ArrayList<>();
        for(Map.Entry<Integer,Customer> entry : customerData.entrySet()){
            if(entry.getValue().getName().equals(customerName)){
                allCustomer.add(entry.getValue());
            }
        }
        return allCustomer;
    }

    public List<Order> getAllOrderByCustomer(int customerId){
        Customer customer = customerData.get(customerId);
        if(customer != null){
            return customer.getOrderList();
        }
        return null;
    }

}
