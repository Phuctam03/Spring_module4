package com.example.validationuser.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "varchar(10)")
    private String id;
    @Size(min = 5, max = 45,message = "Độ dài phải từ 5 đến 45")
    private String firstname;
    @Size(min = 5, max = 45, message ="Độ dài phải từ 5 đến 45")
    private String lastname;
    @Pattern(regexp = "^0[0-9]{9}$",message = "phải đúng định dạng số điên thoai 0xxxxxxxxxxx")
    private String phone;
    @Min(value = 18,message = "tuổi thấp nhất là 18")
    private int age;
    @Email(message = "đúng dịnh dạng email")
    private String email;
    public User() {
    }

    public User(String id, String firstname, String lastname, String phone, int age, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }
    public  User(String firstname,String lastname,String phone,int age,String email){
        this.firstname = firstname;
        this.lastname  = lastname;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
