package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.dto.MemberDTO;
import com.ohgiraffers.member.service.MemberService;
import com.ohgiraffers.member.view.PrintResult;

import java.util.List;
import java.util.Map;

public class MemberController {
    public void selectAllMember() {

        List<MemberDTO> memberList = MemberService.selectAllMember();

        if (memberList != null){
            PrintResult.printMemberList(memberList);
        }else {
            PrintResult.printErrorMessage("selectAllMember");
        }

    }

    public void selectByMemberCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));


        MemberDTO member = MemberService.selectByMemberCode(code);

        if (member != null){
            PrintResult.printMember(member);
        }else {
            PrintResult.printErrorMessage("selectOneMember");
        }

    }

    public void insertMember(Map<String,String> parameter) {

        String name = parameter.get("name");
        String date = parameter.get("date");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();

        member.setName(name);
        member.setBirthDate(date);
        member.setInfo(info);
        member.setContact(contact);

        System.out.println("member = " + member);

        if (MemberService.insertMember(member)){
            PrintResult.printSuccessMessage("insertMember");
        } else {
            PrintResult.printErrorMessage("insertMember");
        }


    }

//    public void deleteMember(Map<String, String> ) {
//    }

    public void modifyMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        String name = parameter.get("name");
        String date = parameter.get("date");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();

        member.setCode(code);
        member.setName(name);
        member.setBirthDate(date);
        member.setInfo(info);
        member.setContact(contact);

        if (MemberService.modifyMember(member)){
            PrintResult.printSuccessMessage("modifyMember");
        }else {
            PrintResult.printErrorMessage("modifyMember");
        }
    }

    public void deleteMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if (MemberService.deleteMember(code)){
            PrintResult.printSuccessMessage("deleteMember");
        }else {
            PrintResult.printErrorMessage("deleteMember");
        }
    }
}
