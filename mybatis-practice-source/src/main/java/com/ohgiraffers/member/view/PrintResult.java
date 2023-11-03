package com.ohgiraffers.member.view;

import com.ohgiraffers.member.common.MemberDTO;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.List;

public class PrintResult {

    public void printMemberList(List<MemberDTO> memberList) {
        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = " ";
        switch(errorCode){
            case "selectList":
                errorMessage = "회원 목록 조회를 실패하였습니다.";
                break;
            case "selectOne":
                errorMessage = "회원 조회를 실패하였습니다.";
                break;
            case "insert":
                errorMessage = "신규 회원 등록 실패하였습니다.";
                break;
            case "update":
                errorMessage = "회원 정보 수정을 실패하였습니다.";break;
            case "delete":
                errorMessage= "회원 삭제에 실패하였습니다."; break;
        }
        System.out.println(errorMessage);


    }

    public void PrintMember(MemberDTO member){
        System.out.println(member);
    }
    public void printSuccessMessage(String successCode){
        String successMessage = " ";
        switch (successCode){
            case "insert":
                successMessage=" 신규 회원 등록을 성공하였습니다.";
                break;
            case "update":
                successMessage="회원 정보 수정을 성공하였습니다. "; break;
            case"delete":
                successMessage= "회원 삭제에 성공하였습니다";break;
        }

        System.out.println(successMessage);
    }




}
