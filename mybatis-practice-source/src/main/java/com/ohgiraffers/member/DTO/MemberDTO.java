package com.ohgiraffers.member.DTO;

import java.sql.Date;

public class MemberDTO {

    private int code;
    private String name;
    private String date;
    private String detailInfo;
    private String contact;
    private String activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String date, String detailInfo, String contact, String activeStatus) {
        this.code = code;
        this.name = name;
        this.date = date;
        this.detailInfo = detailInfo;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
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
                ", date='" + date + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
