package com.ohgiraffers.member.model.dto;

public class MemberDTO {

    private int memberCode;
    private String memberName;
    private String detailDate;
    private String detailInfo;
    private String contact;
    private String activeStatus;

    private String newName;

    public MemberDTO() {

    }

    public MemberDTO(int memberCode, String memberName, String detailDate, String detailInfo, String contact, String activeStatus, String newName) {
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.detailDate = detailDate;
        this.detailInfo = detailInfo;
        this.contact = contact;
        this.activeStatus = activeStatus;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
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

    public String getDetailDate() {
        return detailDate;
    }

    public void setDetailDate(String detailDate) {
        this.detailDate = detailDate;
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
                "memberCode=" + memberCode +
                ", memberName='" + memberName + '\'' +
                ", detailDate='" + detailDate + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", contact='" + contact + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                ", newName='" + newName + '\'' +
                '}';
    }
}
