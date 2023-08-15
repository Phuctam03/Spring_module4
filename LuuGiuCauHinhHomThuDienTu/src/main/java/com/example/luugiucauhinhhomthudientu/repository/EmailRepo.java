package com.example.luugiucauhinhhomthudientu.repository;
import com.example.luugiucauhinhhomthudientu.model.Email;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class EmailRepo {
    private static Map<Integer, Email> myMap = new HashMap<>();

    static {
        myMap.put(1,new Email(1,"English",25,false,"lighter"));
        myMap.put(2,new Email(2,"English",25,true,"lighter and princess"));
        myMap.put(3,new Email(3,"English",25,true,"None"));
        myMap.put(4,new Email(4,"English",25,false,"DataBinding"));
        myMap.put(5,new Email(5,"English",25,true,"you strong you win"));
    }
    public  void update(Email email){
        myMap.put(email.getId(),email);
    }
    public List<Email> FindAll (){
        return new ArrayList<>(myMap.values());
    }
    public  Email findById(int id ){
        return myMap.get(id);
    }
}
