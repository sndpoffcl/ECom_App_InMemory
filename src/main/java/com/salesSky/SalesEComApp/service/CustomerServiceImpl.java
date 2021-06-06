package com.salesSky.SalesEComApp.service;

import com.salesSky.SalesEComApp.dao.CustomerDAO;
import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDAO customerDAO;


    @Override
    public Customer getCustomerDetails(int customerId) {
        return customerDAO.getCustomerDetails(customerId);
    }

    @Override
    public Customer saveCustomerDetails(Customer customer) {
        //validation of data before sending to DAO
        return customerDAO.saveCustomerDetails(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    @Override
    public List<Order> getAllOrderByCustomer(int customerId) {
        return customerDAO.getAllOrderByCustomer(customerId);
    }

    @Override
    public List<Customer> getAllCustomerAboveOrders(int numberOfOrders) {
        List<Customer> customers = getAllCustomer();
        List<Customer> customerWithOrder = new ArrayList<>();
        for(Customer c : customers){
            if(c.getOrderList().size() > numberOfOrders){
                customerWithOrder.add(c);
            }
        }
        return customerWithOrder;
    }

}
