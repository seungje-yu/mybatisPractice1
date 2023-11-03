package com.ohgiraffers.member.DTO;

public class MemberDTO {

    private int code;
    private String name;
    private String birthDate;
    private String detailInfo;
    private String contact;
    private String  activeStatus;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birthDate, String detailInfo, String contact, String activeStatus) {
        this.code = code;
        this.name = name;
        this.birthDate = birthDate;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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
                ", birthDate='" + birthDate + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
