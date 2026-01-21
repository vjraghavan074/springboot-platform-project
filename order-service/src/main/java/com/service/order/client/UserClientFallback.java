package com.service.order.client;

import org.springframework.stereotype.Component;

import com.service.order.dto.UserDto;

@Component
public class UserClientFallback implements UserClient {

	@Override
	public UserDto getUserById(Long id) {
		 UserDto user = new UserDto();
	        user.setId(id);
	        user.setName("Unknown User");
	        user.setEmail("not-available@example.com");
	        return user;
	}

}
