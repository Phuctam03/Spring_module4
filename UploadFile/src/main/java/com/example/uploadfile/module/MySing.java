package com.example.uploadfile.module;

import java.util.List;

public class MySing {
    private String nameSong;
    private String nameSinger;
    private List<String> typeSing;
    private String pathSing;

    public MySing() {
    }

    public MySing(String nameSong, String nameSinger, List<String> typeSing, String pathSing) {
        this.nameSong = nameSong;
        this.nameSinger = nameSinger;
        this.typeSing = typeSing;
        this.pathSing = pathSing;
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

    public String getPathSing() {
        return pathSing;
    }

    public void setPathSing(String pathSing) {
        this.pathSing = pathSing;
    }
    public String displayTypeSing(){
        if(typeSing == null){
            return  "";
        }
        StringBuilder builder = new StringBuilder();
        boolean flag = true;
        for (String t:typeSing) {
            if(flag){
                flag = false;
            }else {
                builder.append(",");
            }
            builder.append(t);
        }
        return builder.toString();
    }
}
