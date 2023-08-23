package com.example.pictuerofday.service;

import com.example.pictuerofday.model.Picture;
import com.example.pictuerofday.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImlp implements PictureService{

    @Autowired
    PictureRepository pictureRepository;

    @Override
    public void add(Picture picture) {
        pictureRepository.add(picture);

    }
    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }
}
