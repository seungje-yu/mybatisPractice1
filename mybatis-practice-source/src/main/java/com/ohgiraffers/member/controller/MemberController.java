package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.dto.MemberDTO;
import com.ohgiraffers.member.etc.PrintResult;
import com.ohgiraffers.member.service.MemberService;

import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Map;

public class MemberController {

    private final PrintResult printResult;
    private final MemberService memberService;


    public MemberController() {
        printResult = new PrintResult();
        memberService = new MemberService();
    }
    public void selectALlMember() {

        List<MemberDTO> memberDTOList = memberService.selectAllMember();

        if (memberDTOList != null) {
            printResult.printMemberList(memberDTOList);

        } else {
            printResult.printFail("selectAllMember");
        }

    }

    public void selectMemberByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MemberDTO memberDTO = MemberService.selectMemberByCode(code);

        if (memberDTO != null) {
            printResult.printMember(memberDTO);
        } else {
            printResult.printFail("selectMemberByCode");
        }

    }

    public void insertMember(Map<String, String> parameter) {

        String memberName = parameter.get("memberName");
        String birthDate = parameter.get("birthDate");
        String detailInfo = parameter.get("detailInfo");
        String contact = parameter.get("contact");

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberName(memberName);
        memberDTO.setBirthDate(birthDate);
        memberDTO.setDetailInfo(detailInfo);
        memberDTO.setContact(contact);

        System.out.println("memberDTO = " + memberDTO);

        if (memberService.insertMember(memberDTO)) {
            printResult.printSuccess("insert");
        } else {
            printResult.printFail("insert");
        }
    }

    public void updateMember(Map<String, String> parameter) {

        int memberCode = Integer.parseInt(parameter.get("memberCode"));
        String memberName = parameter.get("memberName");
        String birthDate = parameter.get("birthDate");
        String detailInfo = parameter.get("detailInfo");
        String contact = parameter.get("contact");

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberCode(memberCode);
        memberDTO.setMemberName(memberName);
        memberDTO.setBirthDate(birthDate);
        memberDTO.setDetailInfo(detailInfo);
        memberDTO.setContact(contact);

        System.out.println("memberDTO = " + memberDTO);

        if (memberService.updateMember(memberDTO)) {
            printResult.printSuccess("update");
        } else {
            printResult.printFail("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if (memberService.deleteMember(code)) {
            printResult.printSuccess("delete");
        } else {
            printResult.printFail("delete");
        }


    }
}
