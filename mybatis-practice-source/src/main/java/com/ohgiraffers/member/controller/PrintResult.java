package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;

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
            case "selectList" : errorMessage = "멤버 목록 조회를 실패하였습니다."; break;
            case "selectOne" : errorMessage = "멤버 조회를 실패하였습니다."; break;
            case "insert" : errorMessage = "신규 멤버 등록을 실패하였습니다."; break;
            case "update" : errorMessage = "멤버 수정을 실패하였습니다."; break;
            case "delete" : errorMessage = "멤버 삭제를 실패하였습니다."; break;
        }

        System.out.println(errorMessage);
    }
}
