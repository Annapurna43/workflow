package com.anna.orderinventory.workflow.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/Orders")
    public List<Order> getOrdersList(){
        return orderService.getOrdersList();
    }

    @RequestMapping("/Orders/{orderId}")
    public Order getOrderdetails(@PathVariable int orderId){
        return orderService.getOrderDetails(orderId);
    }
}
