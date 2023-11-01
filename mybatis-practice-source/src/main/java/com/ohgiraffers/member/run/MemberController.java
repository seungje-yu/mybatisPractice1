package com.ohgiraffers.member.run;

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
        }else{
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMemberByCode(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        System.out.println("code = " + code);

        MemberDTO member = memberService.selectMemberByCode(code);
        if (member != null){
            printResult.printMember(member);
        } else {
            printResult.printErrorMessage("selectMember");
        }





    }

    public void insertMember(Map<String, String> parameter) {
        String name = parameter.get("name");
        String date = parameter.get("date");
        String detail = parameter.get("detail");
        String contact = parameter.get("contact");

        MemberDTO member = new MemberDTO();

        member.setName(name);
        member.setDate(date);
        member.setDetail(detail);
        member.setContact(contact);

        System.out.println("member" + member);

        if(memberService.insertMember(member)){
            printResult.printSuccessMessage("insertMember");

        }else {
            printResult.printErrorMessage("insertMember");
        }

    }

    public void updateMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        String date = parameter.get("date");
        String detail = parameter.get("detail");
        String conteact = parameter.get("contact");
        //이제 dto열어
        MemberDTO member = new MemberDTO();
        //그리고 이제 넣어야되니까 set땡땡(DTO에맞게)
        member.setCode(code);
        member.setName(name);
        member.setDate(date);
        member.setDetail(detail);
        member.setContact(conteact);

        System.out.println("member" + member);

        if(memberService.updateMember(member)){

            printResult.printSuccessMessage("updateMember");

            }else {
            printResult.printErrorMessage("updateMember");
        }

        }

    public void deleteMember(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));

        if(memberService.deleteMember(code)){
            printResult.printSuccessMessage("deleteMember");
        }else{
            printResult.printErrorMessage("deleteMember");
        }
    }
}

