package com.example.uploadfile.service;

import com.example.uploadfile.module.MySing;

import java.util.List;

public interface IMySingService {
    List<MySing> findAll();
    void save(MySing mySing);

}
