package com.example.springmvcthemleaf.service;

import com.example.springmvcthemleaf.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);
    void update(Product product);
    Product findById(int id );
    List<Product> findAll();
    void delete(int id);
    List<Product> findByName(String nameProduct);
}
