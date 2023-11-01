package com.ohgiraffers.member.dto;

public class MemberDTO {
    private int code;
    private String name;
    private String birthdate;
    private String info;
    private String contact;

    private String status;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birthdate, String info, String contact, String status) {
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
        this.info = info;
        this.contact = contact;
        this.status = status;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", info='" + info + '\'' +
                ", contact='" + contact + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
