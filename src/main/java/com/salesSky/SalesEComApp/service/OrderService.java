package com.salesSky.SalesEComApp.service;

import com.salesSky.SalesEComApp.entity.Order;

public interface OrderService {
    Order placeOrder(int customerId, int productId);
    Order cancelOrder(int orderId);
    Order getOrderDetails(int orderId);
}
