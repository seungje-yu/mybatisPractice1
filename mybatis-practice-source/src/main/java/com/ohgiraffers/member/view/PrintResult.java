package com.ohgiraffers.member.view;

import com.ohgiraffers.member.dto.MemberDTO;

import java.sql.SQLOutput;
import java.util.List;

public class PrintResult {

    public void printMember(List<MemberDTO> memberDTOList){
        for(MemberDTO member : memberDTOList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode){
            case "selectList" : errorMessage = "멤버 목록 조회를 실패하였습니다."; break;
            case "selectOne" : errorMessage = "멤버 목록 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 메뉴 등록을 실패하였습니다."; break;
            case "update" : errorMessage = "멤버 목록 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "멤버 목록 삭제를 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printMember(MemberDTO member){
        System.out.println(member);
    }

    public void printSuccessMessage(String successCode){
        String successMessage = "";

        switch (successCode){
            case "insert" : successMessage = "신규 멤버 등록을 성공하였습니다."; break;
            case "update" : successMessage = "메뉴 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "메뉴 삭제를 성공하였습니다."; break;

        }
        System.out.println(successMessage);
    }

}
