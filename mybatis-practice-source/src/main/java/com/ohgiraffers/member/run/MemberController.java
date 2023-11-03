package com.ohgiraffers.member.run;

import java.util.List;
import java.util.Map;

public class MemberController {
    private final PrintResult printResult;
    private final MemberService memberService;

    public MemberController() {
        printResult=new PrintResult();
        memberService=new MemberService();
    }
    public void selectAllMember() {
        List<MemberDTO> memberList = memberService.selectAllMember();

        if(memberList != null) {
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMemberByCode(Map<String, String> parameter) {
        int memberNo = Integer.parseInt(parameter.get("memberNo"));
        System.out.println("memberNo = " + memberNo);

        MemberDTO member = memberService.selectMemberByCode(memberNo);

        if(member != null) {
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMember(Map<String, String> parameter) {
        String name=parameter.get("memberName");
        String gender = parameter.get("gender");
        int age=Integer.parseInt(parameter.get("age"));
        String address=parameter.get("address");
        String phoneNum=parameter.get("phoneNum");

        MemberDTO member = new MemberDTO();
        member.setMemberName(name);
        member.setGender(gender);
        member.setAge(age);
        member.setAddress(address);
        member.setPhoneNum(phoneNum);

        System.out.println("member = " + member);

        if(memberService.insertMember(member)){
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMember(Map<String, String> parameter) {
        int memberNo=Integer.parseInt(parameter.get("memberNo"));
        String name = parameter.get("memberName");
        String gender = parameter.get("gender");
        int age=Integer.parseInt(parameter.get("age"));
        String address=parameter.get("address");
        String phoneNum=parameter.get("phoneNum");

        MemberDTO member = new MemberDTO();
        member.setMemberNo(memberNo);
        member.setMemberName(name);
        member.setGender(gender);
        member.setAge(age);
        member.setAddress(address);
        member.setPhoneNum(phoneNum);

        System.out.println("member = " + member);

        if(memberService.modifyMember(member)){
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        int memberNo = Integer.parseInt(parameter.get("memberNo"));

        if(memberService.deleteMember(memberNo)){
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
