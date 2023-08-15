package com.example.luugiucauhinhhomthudientu.model;


public class Email {

    private int id;
    private String languages;
    private int pageSize;
    private Boolean spamFilter;
    private String signature;

    public Email() {
    }

    public Email(int id, String languages, int pageSize, Boolean spamFilter, String signature) {
        this.id = id;
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public Email(String languages, int pageSize, Boolean spamFilter, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Boolean getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(Boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
