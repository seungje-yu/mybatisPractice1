package com.ohgiraffers.member.model.dto;

import java.sql.Date;


public class MemberDTO {

    private int code; //MEMBER_CODE
    private String name; //MEMBER_NAME
    private String birthDate; //BIRTH_DATE
    private String address; //DETAIL_INFO
    private String phone; //CONTACT
    private String activeStatus; //ACTIVE_STATUS

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birthDate, String address, String phone, String activeStatus) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.activeStatus = activeStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
