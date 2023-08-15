package com.example.formmedical.repository;

import com.example.formmedical.model.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MedicalRepo implements IMedical {
    private static Map<Integer, Medical> medicalMap = new HashMap<>();

    static {
//        medicalMap.put(1,new Medical(1,"ABC",2003,"Male","VietNamese","12346","Tàu Bay","VN123",12,"03/11/2021","04/11/2021","Không","Đà Nẵng,Sơn Trà","Đà Nẵng","0098123","123@gmail.com",);
    }
    @Override
    public Medical findById(int id) {
        return medicalMap.get(id);
    }

    @Override
    public void update(Medical medical) {
        medicalMap.put(medical.getId(), medical);

    }


    @Override
    public List<Medical> findAll() {
        return new ArrayList<>(medicalMap.values());
    }

    @Override
    public void add(Medical medical) {
        medicalMap.put(medical.getId(), medical);
    }

    public static void main(String[] args) {
        MedicalRepo medicalRepo = new MedicalRepo();
        System.out.println(medicalRepo.findAll());
    }
}
