package com.example.pictuerofday.service;

import com.example.pictuerofday.model.Picture;

import java.util.List;

public interface PictureService {
    void add(Picture picture);
    List<Picture> findAll();
}
