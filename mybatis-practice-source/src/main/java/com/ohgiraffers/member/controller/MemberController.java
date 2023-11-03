package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.DTO.MemberDTO;
import com.ohgiraffers.member.service.MemberService;

import java.util.List;
import java.util.Map;

public class MemberController {

    MemberService memberService = new MemberService();

    public void selectAllMember() {
        // db에 select한 값을 받을 준비
        // 필요한 service 요청하고 값을 받음
        List<MemberDTO> memberList = memberService.selectAllMember();

        // 서비스에서 전달받은 값에 따라 성공/실패 처리
        if(memberList != null){
            System.out.println("멤버 전체 조회 성공");
            for(MemberDTO member : memberList){
                System.out.println(member);
            }
        } else {
            System.out.println("멤버 전체 조회 실패");
        }

    }

    public void selectMemberByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MemberDTO member = memberService.selectMemberByCode(code);

        if(member != null){
            System.out.println("멤버 조회 성공");
            System.out.println(member);
        } else {
            System.out.println("멤버 조회 실패");
        }

    }

    public void insertNewMember(Map<String, String> parameter) {

        MemberDTO member = new MemberDTO();
        member.setName(parameter.get("name"));
        member.setDate(parameter.get("date"));
        member.setDetailInfo(parameter.get("detailInfo"));
        member.setContact(parameter.get("contact"));

        System.out.println("신규 등록할 멤버 : " + member);

        if(memberService.insertNewMember(member)){
            System.out.println("신규 멤버 등록 성공");
        } else {
            System.out.println("신규 멤버 등록 실패");
        }

    }

    public void updateMember(Map<String, String> parameter) {

        MemberDTO member = new MemberDTO();
        member.setCode(Integer.parseInt(parameter.get("code"))); // 특정 코드의 레코드 수정
        member.setName(parameter.get("name"));
        member.setDate(parameter.get("date"));
        member.setDetailInfo(parameter.get("detailInfo"));
        member.setContact(parameter.get("contact"));

        if(memberService.updateMember(member)){
            System.out.println("멤버 수정 성공");
        } else {
            System.out.println("멤버 수정 실패");
        }

    }

    public void deleteMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if(memberService.deleteMember(code)){
            System.out.println("멤버 삭제 성공");
        } else {
            System.out.println("멤버 삭제 실패");
        }

    }
}
