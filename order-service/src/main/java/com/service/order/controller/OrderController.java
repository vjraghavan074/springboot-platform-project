package com.service.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.order.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    
    @GetMapping("hello")
    public String getWelcomeMsg() {
        return "order-contoller-connected";
    }

    @GetMapping("/place/{userId}")
    public String placeOrder(@PathVariable Long userId) {
        return orderService.placeOrder(userId);
    }
}

