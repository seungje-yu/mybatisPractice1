package com.ohgiraffers.member.view;

import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;

public class ResultView {

    public void printMemberList(List<MemberDTO> memberList) {
        for (var member : memberList) {
            System.out.println(member);
        }
    }

    public void printMember(MemberDTO member) {
        System.out.println(member);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectAllMembers":
                System.out.println("멤버 전체 목록 출력에 실패했습니다.");
                break;
            case "selectMemberByMemberCode":
                System.out.println("멤버 검색을 실패했습니다.");
                break;
            case "insertMember":
                System.out.println("멤버 추가를 실패했습니다.");
                break;
            case "updateMember":
                System.out.println("멤버 정보 변경을 실패했습니다.");
                break;
            case "deleteMember":
                System.out.println("멤버 삭제를 실패했습니다.");
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String SuccessCode) {
        String successMessage = "";
        switch (SuccessCode) {
            case "insertMember":
                System.out.println("멤버 추가를 성공했습니다.");
                break;
            case "updateMember":
                System.out.println("멤버 정보 변경을 성공했습니다.");
                break;
            case "deleteMember":
                System.out.println("멤버 삭제를 성공했습니다.");
                break;
        }
        System.out.println(successMessage);
    }

}
