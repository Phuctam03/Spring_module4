package com.example.uploadfile.service;

import com.example.uploadfile.module.MySing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class IMySingServiceImlp implements IMySingService {

    private  List<MySing> mySingList = new ArrayList<>();

    @Override
    public List<MySing> findAll() {
        return mySingList;
    }

    @Override
    public void save(MySing mySing) {
        mySingList.add(mySing);
    }




}
