package com.ohgiraffers.member.view;

import com.ohgiraffers.member.dto.MemberDTO;

import java.util.List;

public class PrintResult {
    public static void printMemberList(List<MemberDTO> memberList) {

        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public static void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode){
            case "selectAllMember" : errorMessage = "총 회원 조회를 실패했습니다."; break;
            case "selectOneMember" : errorMessage = "회원 코드 조회를 실패했습니다."; break;
            case "insertMember" : errorMessage = "신규 회원 등록을 실패했습니다."; break;
            case "modifyMember" : errorMessage = "회원 수정을 실패했습니다."; break;
            case "deleteMember" : errorMessage = "회원 삭제를 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }
    public static void printMember(MemberDTO member){
        System.out.println(member);
    }

    public static void printSuccessMessage(String SuccessCode) {
        String SuccessMassege = "";
        switch (SuccessCode){
            case "insertMember" : SuccessMassege = "신규 회원 등록에 성공하였습니다"; break;

            case "modifyMember" : SuccessMassege = "회원 수정에 성공하였습니다"; break;

            case "deleteMember" : SuccessMassege = "회원 삭제에 성공하셨습니다."; break;
        }
        System.out.println(SuccessMassege);
    }
}
