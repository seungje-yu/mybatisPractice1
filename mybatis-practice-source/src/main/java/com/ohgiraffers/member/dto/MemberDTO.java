package com.ohgiraffers.member.dto;

public class MemberDTO {
    private int memberCode;
    private String memberName;
    private String birthDate;
    private String detailInfo;
    private String contact;
    private String activeStatus;

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public MemberDTO(int memberCode, String memberName, String birthDate, String detailInfo, String contact, String activeStatus) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.birthDate = birthDate;
        this.detailInfo = detailInfo;
        this.contact = contact;
        this.activeStatus = activeStatus;
    }

    public MemberDTO() {
    }
}
