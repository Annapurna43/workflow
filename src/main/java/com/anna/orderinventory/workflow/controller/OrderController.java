package com.anna.orderinventory.workflow.controller;

import com.anna.orderinventory.workflow.entity.OrderEntity;
import com.anna.orderinventory.workflow.service.OrderService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderEntity> getOrdersList(){
        return orderService.getOrdersList();
    }

    @GetMapping("/orders/{orderId}")
    public Optional<OrderEntity> getOrderdetails(@PathVariable int orderId){
        return orderService.getOrderDetails(orderId);
    }

    @PostMapping("/order")
    public void createOrder(@RequestBody OrderEntity order){
        System.out.println("we are herre!");
        orderService.createOrder(order);
    }
    @PutMapping("/updateOrderStatus")
    public void updateOrder(@RequestBody OrderEntity order){
        orderService.updateOrder(order);
    }
    @DeleteMapping("/deleteOrder/{orderId}")
    public void deleteOrder(@PathVariable int orderId){
        orderService.deleteOrder(orderId);
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request){

        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());

    }
}
