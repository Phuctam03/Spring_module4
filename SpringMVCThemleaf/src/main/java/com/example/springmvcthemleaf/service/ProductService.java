package com.example.springmvcthemleaf.service;

import com.example.springmvcthemleaf.model.Product;
import com.example.springmvcthemleaf.repository.IProduct;
import com.example.springmvcthemleaf.repository.ProductImlp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProduct productImlp;
    @Override
    public void add(Product product) {
        productImlp.add(product);
    }

    @Override
    public void update(Product product) {
        productImlp.update(product);
    }

    @Override
    public Product findById(int id) {
        return productImlp.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productImlp.findAll();
    }

    @Override
    public void delete(int id) {
        productImlp.delete(id);
    }
    @Override
    public List<Product> findByName(String nameProduct) {
        return productImlp.findByName(nameProduct);
    }
}
