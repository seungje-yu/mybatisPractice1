package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberView {

    public void displayView() {

        /*
        ============ 멤버 관리 ====================
        1. 멤버 전체 조회
        2. 멤버 코드로 조회
        3. 신규 멤버 추가
        4. 멤버 수정
        5. 멤버 삭제
        ==========================================
        멤버의 조회 결과의 결럼
        */
        do {
            Scanner sc = new Scanner(System.in);

            MemberController memberController = new MemberController();

            System.out.println("==========멤버 관리==========");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("===========================");
            System.out.print("번호를 입력해주세요 : ");
            int answer = sc.nextInt();

            switch (answer) {
                case 1: memberController.selectALlMember();
                    break;
                case 2:
                    memberController.selectMemberByCode(inputMemberCode());
                    break;
                case 3:
                    memberController.insertMember(inputMember());
                    break;
                case 4:
                    memberController.updateMember(inputModifyMember());
                    break;
                case 5:
                    memberController.deleteMember(inputMemberCode());
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
        } while(true);



    }

    private Map<String, String> inputModifyMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 회원 코드를 입력하세요 : ");
        String memberCode = sc.nextLine();
        System.out.print("수정할 회원 이름을 입력하세요 : ");
        String memberName = sc.nextLine();
        System.out.print("수정할 생년월일(yy/mm/dd)을 입력하세요 : ");
        String birthDate = sc.nextLine();
        System.out.print("수정할 거주지(ex.서울시)를 입력하세요 : ");
        String detailInfo = sc.nextLine();
        System.out.print("수정할 전화번호를(ex.010-0000-0000) 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode", memberCode);
        parameter.put("memberName", memberName);
        parameter.put("birthDate",birthDate);
        parameter.put("detailInfo", detailInfo);
        parameter.put("contact", contact);

        return parameter;
    }

    private Map<String, String> inputMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("회원 이름을 입력하세요 : ");
        String memberName = sc.nextLine();
        System.out.print("생년월일(yy/mm/dd)을 입력하세요 : ");
        String birthDate = sc.nextLine();
        System.out.print("거주지(ex.서울시)를 입력하세요 : ");
        String detailInfo = sc.nextLine();
        System.out.print("전화번호를(ex.010-0000-0000) 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberName", memberName);
        parameter.put("birthDate",birthDate);
        parameter.put("detailInfo", detailInfo);
        parameter.put("contact", contact);

        return parameter;

    }

    private static Map<String, String> inputMemberCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }
}
