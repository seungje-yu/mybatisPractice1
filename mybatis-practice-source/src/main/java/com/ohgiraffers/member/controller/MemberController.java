package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.service.MemberService;

import java.util.List;
import java.util.Map;

public class MemberController {

    private final MemberService memberService;
    private final PrintResult printResult;

    public MemberController() {

        memberService = new MemberService();
        printResult = new PrintResult();
    }
    public void selectAllMember() {

        List<MemberDTO> memberList = memberService.selectAllMember();

        if (memberList != null) {
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMemberByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code= "+ code);

        MemberDTO member = memberService.selectMemberByCode(code);

        if (member != null) {
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectLOne");
        }
    }

    public void registMember(Map<String, String> parameter) {

        String name = parameter.get("name");
        String date = parameter.get("date");
        String info = parameter.get("info");
        String contact = parameter.get("contact");
        String status = parameter.get("status");

        MemberDTO member = new MemberDTO();
        member.setMemberName(name);
        member.setDetailDate(date);
        member.setDetailInfo(info);
        member.setContact(contact);
        member.setActiveStatus(status);

        System.out.println(member);

        if(memberService.insertMember(member)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMember(Map<String, String> parameter) {

        String memberName = parameter.get("memberName");
        String modifyName = parameter.get("modifyName");
        String date = parameter.get("date");
        String info = parameter.get("info");
        String contact = parameter.get("contact");
        String status = parameter.get("status");

        MemberDTO member = new MemberDTO();
        member.setNewName(modifyName);
        member.setMemberName(memberName);
        member.setDetailDate(date);
        member.setDetailInfo(info);
        member.setContact(contact);
        member.setActiveStatus(status);

        System.out.println(member);

        if (memberService.modifyMember(member)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {

        String name = parameter.get("name");

        if(memberService.deleteMember(name)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
