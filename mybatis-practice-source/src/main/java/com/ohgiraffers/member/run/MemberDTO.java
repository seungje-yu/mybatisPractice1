package com.ohgiraffers.member.run;

import java.util.Date;

public class MemberDTO {
    private int code;
    private String name;
    private String date;
    private String detail;
    private String contact;
    private String activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String date, String detail, String contact, String activeStatus) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.detail = detail;
        this.contact = contact;
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", detail='" + detail + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
}
