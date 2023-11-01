package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.MemberDTO;
import com.ohgiraffers.member.model.MemberService;
import com.ohgiraffers.member.view.PrintResult;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;


public class MemberController {

    private final PrintResult printResult;
    private final MemberService memberService;
    public MemberController() {
        printResult = new PrintResult();
        memberService = new MemberService();
    }
    public void selectAllMember() {

        List<MemberDTO> memberList = memberService.selectAllMember();

        if(memberList != null){
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMemberByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code = " + code);

        MemberDTO member = memberService.seletAllMemberByCode(code);

        if(member != null) {
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMember(Map<String, String> parameter) {

        String name = parameter.get("name");
        String birthDate = parameter.get("birthDate");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();
        member.setName(name);
        member.setBirthDate(birthDate);
        member.setInfo(info);
        member.setContact(contact);

        System.out.println("member = " + member);

        if(memberService.insertMember(member)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birthDate = parameter.get("birthDate");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();
        member.setCode(code);
        member.setName(name);
        member.setBirthDate(birthDate);
        member.setInfo(info);
        member.setContact(contact);

        System.out.println("member = " + member);

        if(memberService.modifyMember(member)) {
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
