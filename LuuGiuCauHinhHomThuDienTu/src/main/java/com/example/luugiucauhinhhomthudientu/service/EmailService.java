package com.example.luugiucauhinhhomthudientu.service;
import com.example.luugiucauhinhhomthudientu.model.Email;
import com.example.luugiucauhinhhomthudientu.repository.EmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailService {
    @Autowired
    private EmailRepo emailRepo;
    public void update(Email email){
        emailRepo.update(email);
    }
    public  Email findById(int id ){
       return  emailRepo.findById(id);
    }
    public List<Email> findAll(){
        return  emailRepo.FindAll();
    }

}
