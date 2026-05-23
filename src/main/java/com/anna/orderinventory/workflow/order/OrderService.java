package com.anna.orderinventory.workflow.order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orders = new ArrayList<>( Arrays.asList(new Order(1,"Provide","PLACED"),
            new Order(2,"Provide","PLACED"),
            new Order(3,"Provide","PLACED")));

    public List<Order> getOrdersList() {
        return orders;
    }

    public Order getOrderDetails(int orderId){
        return orders.stream()
                .filter(order -> order.getOrderId() == orderId)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Order not found: " + orderId));
    }
    public void createOrder(Order order){
        orders.add(order);

    }
}
