package com.example.pictuerofday.repository;

import com.example.pictuerofday.model.Picture;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PictureRepositoryImlp implements PictureRepository{
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void add(Picture picture) {
        entityManager.persist(picture);
    }
    @Override
    public List<Picture> findAll() {
        return entityManager.createQuery(" from Picture p ").getResultList() ;
    }
}
