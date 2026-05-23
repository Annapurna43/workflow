package com.anna.orderinventory.workflow.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/Orders")
    public List<Order> getOrdersList(){
        return orderService.getOrdersList();
    }

    @GetMapping("/Orders/{orderId}")
    public Order getOrderdetails(@PathVariable int orderId){
        return orderService.getOrderDetails(orderId);
    }

    @PostMapping("/Order")
    public void createOrder(@RequestBody Order order){
        orderService.createOrder(order);

    }
}
