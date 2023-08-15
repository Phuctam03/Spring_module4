package com.example.springmvcthemleaf.repository;

import com.example.springmvcthemleaf.model.Product;

import java.util.List;

public interface IProduct {
    void add(Product product);
    void update(Product product);
    Product findById(int id );
    List<Product> findAll();
    void delete(int id);
    List<Product> findByName(String nameProduct);
}
