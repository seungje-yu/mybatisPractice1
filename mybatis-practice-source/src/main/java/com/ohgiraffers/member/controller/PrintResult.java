package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.sun.net.httpserver.Authenticator;

import java.util.List;

public class PrintResult {
    public void printMemberList(List<MemberDTO> memberList) {

        for (MemberDTO member : memberList) {
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회 실패!!"; break;
            case "selectOne" : errorMessage = "메뉴 조회를 실패!!"; break;
            case "insert" : errorMessage = "신규 멤버 등록 실패!"; break;
            case "update" : errorMessage = "멤버 수정 실패!!"; break;
            case "delete" : errorMessage = "멤버 삭제 실패!!"; break;
        }
        System.out.println(errorMessage);
    }


    public void printMember(MemberDTO member) {
        System.out.println(member);
    }

    public void printSuccessMessage(String insert) {

        String successMessage = "";
        switch (insert) {
            case "insert" : successMessage = "신규 멤버 등록 성공!!"; break;
            case "update" : successMessage = "기존 멤버 수정 성공!!"; break;
            case "delete" : successMessage = "기존 멤버 삭제 성공!!"; break;

        }
        System.out.println(successMessage);
    }
}
