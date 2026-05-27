package com.anna.orderinventory.workflow.service;

import com.anna.orderinventory.workflow.entity.OrderEntity;
import com.anna.orderinventory.workflow.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderEntity> getOrdersList() {
        return orderRepository.findAll();
    }

    public Optional<OrderEntity> getOrderDetails(int orderId){
        return orderRepository.findById(orderId);
        
    }
    public void createOrder(OrderEntity order){
        orderRepository.save(order);

    }

    public void updateOrder(OrderEntity order) {
        //Orders existingOrder = orderRepository.findById(order.getOrderId()).orElseThrow(()->new RuntimeException("Order Not Found"));
        orderRepository.save(order);

    }

    public void deleteOrder(int orderId) {
        if(!orderRepository.existsById(orderId)){
            throw new RuntimeException("Order not Found");
        }
        orderRepository.deleteById(orderId);
    }
}
