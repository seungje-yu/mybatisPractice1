package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;
import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.service.MemberService;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MemberView {



    MemberController memberController = null;

    public void displayView() {

        memberController = new MemberController();

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("============ 메뉴 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 멤버 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.print("멤버 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectMemberByCode(inputMemberCode()); break;
                case 3 : memberController.registMember(inputMember()); break;
                case 4 : memberController.modifyMember(inputModifyMember()); break;
                case 5 : memberController.deleteMember(inputDeletMember()); break;
                default:
                    System.out.println("없는 목록번호를 선택하셨습니다."); continue;
            }

        } while (true);


    }

    private Map<String, String> inputDeletMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 회원의 이름을 입력하세요 : ");
        String deleteName = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", deleteName);

        return parameter;

    }


    private Map<String, String> inputModifyMember() {

        MemberService memberService = new MemberService();

        List<MemberDTO> memberList = memberService.selectAllMember();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("변경하려는 회원이름을 입력하세요 : ");
            String memberName= sc.nextLine();

            boolean istrue = false;

            for (MemberDTO member : memberList) {
                if(member.getMemberName().equals(memberName)){
                    istrue = true;
                }
            }

            String modifyName = "";
            String modifyDate= "";
            String modifyInfo= "";
            String modifyContact= "";
            String modifyStatus= "";

            if (istrue) {
                System.out.print(memberName+"회원님의 변경할 이름을 입력하세요 : ");
                modifyName = sc.nextLine();
                System.out.print(memberName+"회원님의 변경할 생년월일을 입력하세요 : ");
                modifyDate = sc.nextLine();
                System.out.print(memberName+"회원님의 변경할 주소를 입력하세요 : ");
                modifyInfo = sc.nextLine();
                System.out.print(memberName+"회원님의 변경할 휴대폰번호 입력하세요 : ");
                modifyContact = sc.nextLine();
                System.out.print(memberName+"회원님의 변경할 근무상태를 입력하세요 : ");
                modifyStatus = sc.nextLine();

                Map<String, String> parameter = new HashMap<>();
                parameter.put("memberName", memberName);
                parameter.put("modifyName", modifyName);
                parameter.put("date", modifyDate);
                parameter.put("info", modifyInfo);
                parameter.put("contact", modifyContact);
                parameter.put("status", modifyStatus);

                return parameter;
            } else {
                System.out.println("없는 회원입니다");
            }
        } while (true);
    }

    private Map<String, String> inputMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("추가할 회원 이름을 입력하세요 : ");
        String newMemberName = sc.nextLine();
        System.out.print("추가할 회원 생년월일을 입력하세요 : ");
        String newMemberDate = sc.nextLine();
        System.out.print("추가할 회원 주소를 입력하세요(ex) 서울시) : ");
        String newMemberInfo = sc.nextLine();
        System.out.print("추가할 회원 휴대폰번호를 입력하세요 : ");
        String newMemberContact = sc.nextLine();
        System.out.print("추가할 회원의 활동상태를 입력하세요(y / n) : ");
        String newMemberStatus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name",newMemberName);
        parameter.put("date",newMemberDate);
        parameter.put("info",newMemberInfo);
        parameter.put("contact",newMemberContact);
        parameter.put("status",newMemberStatus);

        return parameter;

    }

    private Map<String, String> inputMemberCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }
}
