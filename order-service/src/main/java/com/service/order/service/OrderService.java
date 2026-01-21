package com.service.order.service;

import org.springframework.stereotype.Service;

import com.service.order.client.UserClient;
import com.service.order.dto.UserDto;

@Service
public class OrderService {

    private final UserClient userClient;

    public OrderService(UserClient userClient) {
        this.userClient = userClient;
    }

    public String placeOrder(Long userId) {
        UserDto user = userClient.getUserById(userId);
        return "Order placed for user: " + user.getName();
    }
}

