package com.example.validationuser.service;


import com.example.validationuser.entity.User;
import com.example.validationuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImlp implements  UserSerivce{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
