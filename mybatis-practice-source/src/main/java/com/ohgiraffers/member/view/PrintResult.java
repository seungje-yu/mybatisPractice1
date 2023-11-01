package com.ohgiraffers.member.view;

import com.ohgiraffers.member.model.MemberDTO;

import java.util.List;

public class PrintResult {

    public void printMemberList(List<MemberDTO> memberList) {
        for(MemberDTO member : memberList) {
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode){
            case "selectList" : errorMessage = "멤버 목록 조회를 실패하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printMember(MemberDTO member) {
        System.out.println(member);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
            case "insert" : successMessage = "신규 멤버 등록을 성공하였습니다."; break;
            case "update" : successMessage = "멤버 수정을 성공하였습니다."; break;
            case "delete" : successMessage = "멤버 삭제를 성공하였습니다."; break;
        }
    }
}
