package com.salesSky.SalesEComApp.dao;

import com.salesSky.SalesEComApp.entity.Customer;
import com.salesSky.SalesEComApp.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrderDAO {
    private static HashMap<Integer, Order> orderData = new HashMap<>();

    public Order saveOrderDetails(Order order){
        if(orderData.get(order.getId()) == null){
            orderData.put(order.getId(), order);
        }
        return  orderData.get(order.getId());
    }

    public Order getOrderDetails(int orderId){
        return orderData.get(orderId);
    }

    public List<Order> getAllOrders(){
        List<Order> allOrders = new ArrayList<>();
        for(Map.Entry<Integer,Order> entry : orderData.entrySet()){
            allOrders.add(entry.getValue());
        }
        return allOrders;
    }
}
