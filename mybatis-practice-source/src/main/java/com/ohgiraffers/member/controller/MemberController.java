package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.model.service.MemberService;

import java.util.List;

public class MemberController {

    private final PrintResult printResult;

    private final MemberService memberService;

    public MemberController() {

        printResult = new PrintResult();
        memberService = new MemberService();
    }

    public void selectAllMember() {

        List<MemberDTO> memberList = memberService.selectAllMember();

        if (memberList != null) {
            printResult.printMemberList(memberList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }
}
