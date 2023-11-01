package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.model.service.MemberService;
import com.ohgiraffers.member.view.ResultView;

import java.util.List;
import java.util.Map;

public class MemberController {
    private final MemberService memberService;
    private final ResultView resultView;

    public MemberController() {
        memberService = new MemberService();
        resultView = new ResultView();
    }

    public void selectAllMembers() {
        List<MemberDTO> memberList = memberService.selectAllMembers();
        if (memberList != null) {
            // 잘 출력됐다는 resultView
            resultView.printMemberList(memberList);
        } else {
            // 출력 실패했다는 resultView
            resultView.printErrorMessage("selectAllMembers");
        }
    }

    public void selectMemberByMemberCode(Map<String, String> parameter) {
        MemberDTO member = memberService.selectMemberByMemberCode(Integer.parseInt(parameter.get("memberCode")));
        if (member != null) {
            // 잘 출력됐다는 resultView
            resultView.printMember(member);
        } else {
            // 출력 실패했다는 resultView
            resultView.printErrorMessage("selectMemberByMemberCode");
        }
    }

    public void insertMember(Map<String, String> parameter) {
        MemberDTO member = new MemberDTO();
        member.setMemberName(parameter.get("memberName"));
        member.setBirthDate(parameter.get("birthDate"));
        member.setDetailInfo(parameter.get("detailInfo"));
        member.setContact(parameter.get("contact"));
        if (memberService.insertMember(member)) {
            // 잘 입력됐다는 resultView
            resultView.printSuccessMessage("insertMember");
        } else {
            // 입력 실패했다는 resultView
            resultView.printErrorMessage("insertMember");
        }
    }

    public void updateMember(Map<String, String> parameter) {
        MemberDTO member = new MemberDTO();
        member.setMemberCode(Integer.parseInt(parameter.get("memberCode")));
        member.setMemberName(parameter.get("memberName"));
        member.setBirthDate(parameter.get("birthDate"));
        member.setDetailInfo(parameter.get("detailInfo"));
        member.setContact(parameter.get("contact"));
        if (memberService.updateMember(member)) {
            // 잘 업데이트 됐다는 resultView
            resultView.printSuccessMessage("updateMember");
        } else {
            // 업데이트 실패했다는 resultView
            resultView.printErrorMessage("updateMember");
        }
    }

    public void deleteMember(Map<String, String> parameter) {
        int memberCode = Integer.parseInt(parameter.get("memberCode"));
        if (memberService.deleteMember(memberCode)) {
            // 잘 삭제했다는 resultView
            resultView.printSuccessMessage("deleteMember");
        } else {
            // 삭제 실패했다는 resultView
            resultView.printErrorMessage("deleteMember");
        }
    }
}
