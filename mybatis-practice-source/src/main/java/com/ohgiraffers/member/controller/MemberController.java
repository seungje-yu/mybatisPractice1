package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.service.MemberService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberController {

    MemberService memberService = new MemberService();

    public void selectAllMember() {

        List<MemberDTO> memberList = memberService.selectAllMember();

        for(MemberDTO m : memberList){

            System.out.println(m);
        }

    }
    public void selectMemberCode(Map<String, String> parameter) {

        List<MemberDTO> memberList = memberService.selectMemberCode(parameter);
        for(MemberDTO m : memberList){

            System.out.println(m);
        }

    }

    public void registMember() {

        Scanner sc = new Scanner(System.in);

        System.out.print("신규로 등록할 회원 이름 : ");
        String name = sc.nextLine();
        System.out.print("생년월일 입력 YY/MM/DD 형식으로 : ");
        String birthDate = sc.nextLine();
        System.out.print("도시 입력 : ");
        String address = sc.nextLine();
        System.out.print("전화번호 입력 : ");
        String phone = sc.nextLine();

        MemberDTO newMember = new MemberDTO();

        newMember.setName(name);
        newMember.setBirthDate(birthDate);
        newMember.setAddress(address);
        newMember.setPhone(phone);

        memberService.registMember(newMember);

        System.out.println(newMember);


    }
    public void modifyMember(Map<String, String> parameter){

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String birthDate = parameter.get("birthDate");
        String address = parameter.get("address");
        String phone = parameter.get("phone");


        MemberDTO modifyMember = new MemberDTO();

        modifyMember.setCode(code);
        modifyMember.setName(name);
        modifyMember.setBirthDate(birthDate);
        modifyMember.setAddress(address);
        modifyMember.setPhone(phone);

        memberService.modifyMember(modifyMember);

        System.out.println(modifyMember);

    }


    public void deleteMember(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MemberDTO deleteMember = new MemberDTO();

        deleteMember.setCode(code);

        memberService.deleteMember(deleteMember);
    }
}
