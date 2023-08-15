package com.example.formmedical.repository;

import com.example.formmedical.model.Medical;

import java.util.List;

public interface IMedical {
    Medical findById(int id);
    void update(Medical medical);
    List<Medical> findAll();
    void  add(Medical medical);


}
