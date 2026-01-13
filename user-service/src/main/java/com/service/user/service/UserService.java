package com.service.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.user.entity.User;
import com.service.user.repository.UsesrRepository;

@Service
public class UserService {

    private final UsesrRepository repository;

    public UserService(UsesrRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
