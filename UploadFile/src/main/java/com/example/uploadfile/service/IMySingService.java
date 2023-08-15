package com.example.uploadfile.service;

import com.example.uploadfile.module.MySing;
import com.example.uploadfile.module.Product;

import java.util.List;

public interface IProductService {
    List<MySing> findAll();
    void save(MySing mySing);
    Product findById(int id );
    void update (int id,MySing mySing);
    void remove(int id);

}
