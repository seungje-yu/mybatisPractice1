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
        Scanner sc = new Scanner(System.in);

        MemberController memberController = new MemberController();

        do {
            System.out.println("==================== 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("0. 프로그램 종료");
            System.out.print("원하시는 관리자 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectByMemberCode(inputMemberCode()); break;
                case 3 : memberController.insertMember(inputMember()); break;
                case 4 : memberController.modifyMember(inputModifyMember()); break;
                case 5 : memberController.deleteMember(inputMemberCode()); break;
                case 0 : return;
            }
        }while (true);
    }

    private Map<String,String> inputModifyMember() {
        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 회원의 코드를 입력해주세요 :");
        String code = sc.nextLine();
        System.out.print("수정될 회원의 이름을 입력해주세요 :");
        String name = sc.nextLine();
        System.out.print("수정될 회원의 생일을 입력해주세요 :");
        String date = sc.nextLine();
        System.out.print("수정될 회원의 지역을 입력해주세요 :");
        String info = sc.nextLine();
        System.out.print("수정될 회원의 번호를 입력해주세요 :");
        String contact = sc.nextLine();

        Map<String,String> member = new HashMap<>();

        member.put("code",code);
        member.put("name",name);
        member.put("date",date);
        member.put("info",info);
        member.put("contact",contact);

        return member;
    }

    private Map<String, String> inputMember() {
        Scanner sc = new Scanner(System.in);

        System.out.print("회원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("회원의 생년월일을 입력하세요 : ");
        String date = sc.nextLine();
        System.out.print("회원의 주거지를 시 단위로 입력해주세요 : ");
        String info = sc.nextLine();
        System.out.print("회원의 전화번호를 입력해주세요 : ");
        String contact = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("date", date);
        parameter.put("info", info);
        parameter.put("contact",contact);

        return parameter;
    }

    private Map<String,String> inputMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드를 입력해주세요 : ");
        String code = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }


}
