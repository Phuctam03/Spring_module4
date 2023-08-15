package com.example.formmedical.model;

import java.util.List;

public class Medical {
    private int id;
    private String name;
    private int yearBirthday;
    private String gender;
    private String nationality;
    private String identityCard;
    private String travelInfo;
    private String vehicleNumber;
    private int chairNumber;
    private String startDepart;

    private String endDepart;

    private String moreInfo;
    private String contactAddressFirst;

    private String liveAddress;
    private String phone;
    private String email;
    private List<Symptom> sysmptom;

    public Medical() {
    }

    public Medical(int id, String name, int yearBirthday, String gender, String nationality, String identityCard, String travelInfo, String vehicleNumber, int chairNumber, String startDepart,
                   String endDepart, String moreInfo,
                   String contactAddressFirst, String liveAddress, String phone, String email, List<Symptom> sysmptom) {
        this.id = id;
        this.name = name;
        this.yearBirthday = yearBirthday;
        this.gender = gender;
        this.nationality = nationality;
        this.identityCard = identityCard;
        this.travelInfo = travelInfo;
        this.vehicleNumber = vehicleNumber;
        this.chairNumber = chairNumber;
        this.startDepart = startDepart;
        this.endDepart = endDepart;
        this.moreInfo = moreInfo;
        this.contactAddressFirst = contactAddressFirst;
        this.liveAddress = liveAddress;
        this.phone = phone;
        this.email = email;
        this.sysmptom = sysmptom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTravelInfo() {
        return travelInfo;
    }

    public void setTravelInfo(String travelInfo) {
        this.travelInfo = travelInfo;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getStartDepart() {
        return startDepart;
    }

    public void setStartDepart(String startDepart) {
        this.startDepart = startDepart;
    }

    public String getEndDepart() {
        return endDepart;
    }

    public void setEndDepart(String endDepart) {
        this.endDepart = endDepart;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getContactAddressFirst() {
        return contactAddressFirst;
    }

    public void setContactAddressFirst(String contactAddressFirst) {
        this.contactAddressFirst = contactAddressFirst;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Symptom> getSysmptom() {
        return sysmptom;
    }

    public void setSysmptom(List<Symptom> sysmptom) {
        this.sysmptom = sysmptom;
    }
}
