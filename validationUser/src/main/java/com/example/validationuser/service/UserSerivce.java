package com.example.validationuser.service;


import com.example.validationuser.entity.User;

import java.util.List;

public interface UserSerivce {
    User findById(String id );
    void create(User user);
    List<User> findAll();

}
