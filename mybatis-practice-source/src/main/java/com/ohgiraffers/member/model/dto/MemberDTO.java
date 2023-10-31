package com.ohgiraffers.member.model.dto;

import java.util.Date;

public class MemberDTO {

    private int code;
    private String name;
    private Date birthDate;
    private String region;
    private String contact;
    private String activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, Date birthDate, String region, String contact, String activeStatus) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
        this.region = region;
        this.contact = contact;
        this.activeStatus = activeStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", region='" + region + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
