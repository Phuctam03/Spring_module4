package com.example.uploadfile.module;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class FormSing {
    private String nameSong;
    private String nameSinger;
    private List<String> typeSing;
    private MultipartFile sing;

    public FormSing() {
    }

    public FormSing(String nameSong, String nameSinger, List<String> typeSing, MultipartFile sing) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.typeSing = typeSing;
        this.sing = sing;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public List<String> getTypeSing() {
        return typeSing;
    }

    public void setTypeSing(List<String> typeSing) {
        this.typeSing = typeSing;
    }

    public MultipartFile getSing() {
        return sing;
    }

    public void setSing(MultipartFile sing) {
        this.sing = sing;
    }
}
