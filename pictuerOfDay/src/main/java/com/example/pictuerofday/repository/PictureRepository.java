package com.example.pictuerofday.repository;

import com.example.pictuerofday.model.Picture;

import java.util.List;

public interface PictureRepository {
    void add(Picture picture);
    List<Picture> findAll();
}
