package com.ohgiraffers.member.run;

import com.ohgiraffers.member.DTO.MemberDTO;

import java.util.HashMap;
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
        if (memberList != null){
            printResult.printMemberList(memberList);
        }else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectMemberCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code = " + code);

        MemberDTO member = memberService.selectMemberByCode(code);

        if (member != null){
            printResult.printMember(member);
        }else {
            printResult.printErrorMessage("selectOne");
        }

    }

    public void insertMember(Map<String, String> parameter) {
        String name = parameter.get("name");
        String birthDate = parameter.get("birthDate");
        String detailInfo = parameter.get("detailInfo");
        String contact = parameter.get("contact");
        String activeStatus = parameter.get("activeStatus");

        MemberDTO member = new MemberDTO();
        member.setName(name);
        member.setBirthDate(birthDate);
        member.setDetailInfo(detailInfo);
        member.setContact(contact);
        member.setActiveStatus(activeStatus);

        System.out.println("member = " + member);

        if (memberService.insertMember(member)){
            printResult.printSuccessMessage("insert");
        }else {
            printResult.printErrorMessage("insert");
        }


    }

    public void upDateMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birthDate = parameter.get("birthDate");
        String detailInfo = parameter.get("detailInfo");
        String contact = parameter.get("contact");
        String activeStatus = parameter.get("activeStatus");

        MemberDTO member = new MemberDTO();
        member.setCode(code);
        member.setName(name);
        member.setBirthDate(birthDate);
        member.setDetailInfo(detailInfo);
        member.setContact(contact);
        member.setActiveStatus(activeStatus);

        System.out.println("member = " + member);


        if (memberService.updateMember(member)){
            printResult.printSuccessMessage("update");
        }else {
            printResult.printErrorMessage("update");
        }


    }

    public void deleteMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        if (memberService.deleteMember(code)){
            printResult.printSuccessMessage("delete");
        }else {
            printResult.printErrorMessage("delete");
        }
    }
}
