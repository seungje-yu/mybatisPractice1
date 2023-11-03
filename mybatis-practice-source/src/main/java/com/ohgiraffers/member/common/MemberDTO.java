package com.ohgiraffers.member.common;

public class MemberDTO {
    private int code;
    private String name;
    private String birth;
    private String detail;
    private String contact;
    private String active;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birth, String detail, String contact, String active) {
        this.code = code;
        this.name = name;
        this.birth = birth;
        this.detail = detail;
        this.contact = contact;
        this.active = active;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", detail='" + detail + '\'' +
                ", contact='" + contact + '\'' +
                ", active='" + active + '\'' +
                '}';
    }
}
