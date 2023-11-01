package com.ohgiraffers.member.run;

import java.util.List;

public class PrintResult {

    public void printMemberList(List<MemberDTO> memberList){
        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode){
        String errorMessage = "";
        switch (errorCode){
            case "selectList" : errorMessage = "맴버목록조회를 실패했습니다."; break;
            case "selectMember" : errorMessage = "맴버조회를 실패했습니다."; break;
            case "insertMember" : errorMessage = "맴버등록에 실패했습니다."; break;
            case "updateMember" : errorMessage = "맴버수정에 실패했습니다."; break;
            case "deleteMember" : errorMessage = "맴버삭제에 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printMember(MemberDTO member) {
        System.out.println(member);
    }


    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode){
//            case "selectList" : successMessage = "맴버목록조회 성공!"; break;
//            case "selectMember" : successMessage = "맴버조회 성공!"; break;
            case "insertMember" : successMessage = "맴버등록 성공!"; break;
            case "updateMember" : successMessage = "맴버수정 성공!"; break;
            case "deleteMember" : successMessage = "맴버삭제 성공!"; break;

        }
        System.out.println(successMessage);
    }
}
