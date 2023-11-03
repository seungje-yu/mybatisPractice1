package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.Service.MemberService;
import com.ohgiraffers.member.Service.PrintResult;
import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.awt.SystemColor.info;


/* 컨트롤러 (Controller): 컨트롤러는 사용자의 요청을 처리하고 모델과 뷰를 연결합니다.
사용자 입력 및 요청을 받아서 해당 동작을 수행하고 모델과 뷰 간의 상호 작용을 관리합니다.
컨트롤러는 클라이언트 요청을 처리하고 모델 및 뷰 간의 데이터 전달을 조정합니다. */
public class MemberController {
    private final PrintResult printResult;
    private final MemberService memberService;
        // 사용자의 요청 처리 mainview 처리


    public MemberController() {

        printResult = new PrintResult();
        memberService = new MemberService();
    }

    public void selectAllMember(){
        List<MemberDTO> memberList = memberService.selectAllMember();
// MenuDTO 객체의 리스트 저장 ↑ 변수 = menuService의 selectAllMenu 메서드 호출하는 코드
        if(memberList != null) {
            printResult.printMemberList(memberList);
        } else {
            System.out.println("에러");;
        }
    }
    public void codeSelectMember(Map<String, String> parameter){

        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code = " + code);

        MemberDTO member = memberService.codeSelectMember(code);

        if(member != null) {
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }


    }

    public void addNewMember(Map<String, String> parameter) {

        String name = parameter.get("name");
        String birth = parameter.get("birth");
        String info = parameter.get("info");
        String contact = parameter.get("contact");
        String status = parameter.get("status");





        MemberDTO member = new MemberDTO();

        member.setName(name);
        member.setBirth(birth);
        member.setInfo(info);
        member.setContact(contact);
        member.setStatus(status);

        System.out.println("member = " + member);

        if(memberService.insertMenu(member)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }


    }

    public void insertMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birth = parameter.get("birth");
        String info = parameter.get("info");
        String contact = parameter.get("contact");
        String status = parameter.get("status");


        MemberDTO member = new MemberDTO();
        member.setCode(code);
        member.setName(name);
        member.setBirth(birth);
        member.setInfo(info);
        member.setContact(contact);
        member.setStatus(status);


        System.out.println("member = " + member);

        if(memberService.modifyMember(member)){
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if(memberService.deleteMember(code)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
    }
