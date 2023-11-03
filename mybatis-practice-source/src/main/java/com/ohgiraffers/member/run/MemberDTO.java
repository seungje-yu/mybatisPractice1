package com.ohgiraffers.member.run;

public class MemberDTO {
    private int memberNo;
    private String memberName;
    private String gender;
    private int age;
    private String address;
    private String phoneNum;

    public MemberDTO() {
    }

    public MemberDTO(int memberNo, String memberName, String gender, int age, String address, String phoneNum) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
