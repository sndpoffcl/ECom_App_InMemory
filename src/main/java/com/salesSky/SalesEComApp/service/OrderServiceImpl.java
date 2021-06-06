package com.salesSky.SalesEComApp.service;

import com.salesSky.SalesEComApp.dao.CustomerDAO;
import com.salesSky.SalesEComApp.dao.OrderDAO;
import com.salesSky.SalesEComApp.dao.ProductDAO;
import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.entity.Order;
import com.salesSky.SalesEComApp.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderDAO orderDAO;

    @Autowired
    CustomerDAO customerDAO;

    @Autowired
    ProductDAO productDAO;


    @Override
    public Order placeOrder(int customerId, int productId) {
        //validate if product exists, and isActive
        Customer savedCustomer = customerDAO.getCustomerDetails(customerId);
        Order newOrder = new Order();
        if(savedCustomer != null){
            newOrder.setId(100);
            newOrder.setProduct(new Product());
            newOrder.setCustomer(savedCustomer);
            newOrder.setStatus("Order Placed");
            newOrder.setOrderDate("06/06/21");
            newOrder.setTotalAmount(1000); //set total amount from product price
            orderDAO.saveOrderDetails(newOrder);
            savedCustomer.getOrderList().add(newOrder);
            customerDAO.saveCustomerDetails(savedCustomer);
        }
        return newOrder;
    }

    @Override
    public Order cancelOrder(int orderId) {
        return null;
    }

    @Override
    public Order getOrderDetails(int orderId) {
        return null;
    }
}
