package com.ohgiraffers.member.Controller;

import com.ohgiraffers.member.Service.MemberService;
import com.ohgiraffers.member.dto.MemberDTO;
import com.ohgiraffers.member.view.PrintResult;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class MemberController {

private final PrintResult printResult;
private final MemberService memberService;

    public MemberController(){
        printResult = new PrintResult();
        memberService = new MemberService();
    }
    public void selectAllMenu() {
        List<MemberDTO> memberList = memberService.selectAllMenu();

        if(memberList != null){
            printResult.printMember(memberList);
        }else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMemberByCode(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        MemberDTO memberDTO = memberService.selectMemberByCode(code);

        if(memberDTO != null){
            printResult.printMember(memberDTO);
        }else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMember(Map<String, String> parameter) {
        String name = parameter.get("name");
        String birthdate = parameter.get("birthdate");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName(name);
        memberDTO.setBirthdate(birthdate);
        memberDTO.setInfo(info);
        memberDTO.setContact(contact);
        System.out.println("memberDTO = " + memberDTO);

        if(memberService.insertMember(memberDTO)){
            printResult.printSuccessMessage("insert");
        }else{
            printResult.printErrorMessage("insert");
        }


    }

    public void modifyMenu(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birthdate = parameter.get("birthdate");
        String info = parameter.get("info");
        String contact = parameter.get("contact");

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setCode(code);
        memberDTO.setName(name);
        memberDTO.setBirthdate(birthdate);
        memberDTO.setInfo(info);
        memberDTO.setContact(contact);
        System.out.println("memberDTO = " + memberDTO);

        if(memberService.modifyMember(memberDTO)){
            printResult.printSuccessMessage("update");
        }else{
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));

        if(memberService.deleteMenu(code)){
            printResult.printSuccessMessage("delete");
        }else {
            printResult.printErrorMessage("delete");
        }
    }
}
