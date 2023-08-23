package com.example.pictuerofday.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "picture")
public class Picture {
    @Id
    @GeneratedValue
    private  int id ;
    private  int assess;
    private  String author;
    private  String feedBack;

    public Picture(){}

    public Picture(int id, int assess, String author, String feedBack) {
        this.id = id;
        this.assess = assess;
        this.author = author;
        this.feedBack = feedBack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAssess() {
        return assess;
    }

    public void setAssess(int assess) {
        this.assess = assess;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }
}
