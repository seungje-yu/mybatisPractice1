package com.ohgiraffers.member.model.dto;

public class MemberDTO {
    private int memberCode;
    private String memberName;
    private String birthDate;
    private String detailInfo;
    private String contact;
    private String activeStatus;

    public MemberDTO() {
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "memberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
