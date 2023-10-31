package com.ohgiraffers.member.etc;

import com.ohgiraffers.member.dto.MemberDTO;

import javax.xml.transform.Source;
import java.util.List;

public class PrintResult {
    public void printSuccess(String message) {

        switch (message){
            case "insertMember" :
                System.out.println("회원 추가에 성공했습니다.");
            case "update" :
                System.out.println("회원 수정에 성공했습니다.");
            case "delete" :
                System.out.println("회원 수정에 성공했습니다.");
        }

    }

    public void printFail(String message) {

        switch (message) {
            case "selectMemberByCode" :
                System.out.println("회원 조회에 실패했습니다.");
            case "insertMember" :
                System.out.println("회원 추가에 실패했습니다.");
            case "update" :
                System.out.println("회원 수정에 실패했습니다.");
            case "delete" :
                System.out.println("회원 수정에 실패했습니다.");
        }
    }

    public void printMemberList(List<MemberDTO> memberDTOList) {

        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println(memberDTO);
        }
    }

    public void printMember(MemberDTO memberDTO) {

        System.out.println(memberDTO);
    }
}
