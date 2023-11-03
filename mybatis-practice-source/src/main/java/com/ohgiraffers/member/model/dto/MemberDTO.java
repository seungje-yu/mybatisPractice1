package com.ohgiraffers.member.model.dto;
/* 모델 (Model): 모델은 응용 프로그램의 데이터와 비즈니스 로직을 나타냅니다.
데이터베이스와 상호 작용하고 데이터를 가져오거나 저장하는 역할을 합니다.
모델은 응용 프로그램의 상태와 비즈니스 로직을 관리합니다. */
public class MemberDTO {
    // db에서 가저온 정보 저장 전송 교환
    private int code;
    private String name;
    private String birth;
    private String info;
    private String contact;
    private String status;

    public MemberDTO() {
    }

    public MemberDTO(int code, String name, String birth, String info, String contact, String status) {
        this.code = code;
        this.name = name;
        this.birth = birth;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
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

    public void setContact(String contact) { this.contact = contact; }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "DTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", info='" + info + '\'' +
                ", contact=" + contact +
                ", status=" + status +
                '}';
    }
}

