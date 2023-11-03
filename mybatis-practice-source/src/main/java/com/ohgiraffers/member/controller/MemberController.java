package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.common.MemberDTO;
import com.ohgiraffers.member.sevice.MemberService;
import com.ohgiraffers.member.view.MemberView;
import com.ohgiraffers.member.view.PrintResult;

import java.lang.reflect.Member;
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


    public void selectAllMember() {
        List<MemberDTO> memberList = memberService.selectAllMenu();

        if(memberList !=null){
            printResult.printMemberList(memberList);
        } else{
            printResult.printErrorMessage("selectList");
        }


    }

    public void selectMemberByCode(Map<String, String> parameter) {
        int code=Integer.parseInt(parameter.get("code"));
        System.out.println("code =" +code);

        MemberDTO member = memberService.selectMemberByCode(code);
        if(member !=null){
            printResult.PrintMember(member);
        }else {
            printResult.printErrorMessage("selectOne");
        }


    }

    public void registMemeber(Map<String, String> parameter) {
        String name = parameter.get("name");
        String birth =parameter.get("birth");
        String detail = parameter.get("detail");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();
        member.setName(name);
        member.setBirth(birth);
        member.setDetail(detail);
        member.setContact(contact);

        System.out.println("member = " +member);

        if(memberService.insertMember(member)){
            printResult.printSuccessMessage("insert");

        }else {
            printResult.printErrorMessage("insert");
        }





    }

    public void modifyMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birth =parameter.get("birth");
        String detail = parameter.get("detail");
        String contact = parameter.get("contact");


        MemberDTO member = new MemberDTO();
        member.setCode(code);
        member.setName(name);
        member.setBirth(birth);
        member.setDetail(detail);
        member.setContact(contact);

        System.out.println("member = " +member);

        if(memberService.modifyMember(member)){
            printResult.printSuccessMessage("update");
        }else {
            printResult.printErrorMessage("update");
        }
    }



    public void deleteMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));

        if(memberService.deleteMember(code)){
            printResult.printSuccessMessage("delete");
        }else{
            printResult.printErrorMessage("delete");
        }

    }
}












