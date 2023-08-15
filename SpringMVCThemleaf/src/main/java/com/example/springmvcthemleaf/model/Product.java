package com.example.springmvcthemleaf.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int id;
    private String nameProduct;
    private double price;
    private String description;
    private String producer;
    private List<String> typeProduct;

    public Product() {
    }

    public Product(int id, String nameProduct, double price, String description, String producer, List<String> typeProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.description = description;
        this.producer = producer;
        this.typeProduct = typeProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public List<String> getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(List<String> typeProduct) {
        this.typeProduct = typeProduct;
    }


    public  String displayTypeProduct(){
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        if(typeProduct == null){
            return  "";
        }
        for (String t: typeProduct) {
            if(flag){
                flag = false;
            }else {
                stringBuilder.append(",");
            }
            stringBuilder.append(t);
        }
        return stringBuilder.toString();
    }
}
