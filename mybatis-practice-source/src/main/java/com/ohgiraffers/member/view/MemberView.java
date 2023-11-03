package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberView {

    public static void displayView() {

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
            System.out.println("============ 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 메뉴 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.print("멤버 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectMemberByCode(inputMemberCode()); break;
                case 3 : memberController.registMember(inputMember());  break;
                case 4 : memberController.modifyMember(inputModifyMember()); break;
                case 5 : memberController.deleteMember(inputMemberCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다."); break;
            }
        } while (true);
    }

    private static Map<String, String> inputModifyMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("수정할 멤버 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 멤버의 생일을 입력하세요 : ");
        String birthdate = sc.nextLine();
        System.out.print("수정할 멤버의 거주지를 입력하세요 : ");
        String detailinfo = sc.nextLine();
        System.out.print("수정할 멤버의 전화번호를 입력하세요 : ");
        String contact = sc.nextLine();
        System.out.print("수정할 멤버의 등록여부를 입력하세요 Y/N : ");
        String activestatus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("birthdate", birthdate);
        parameter.put("detailinfo", detailinfo);
        parameter.put("contact", contact);
        parameter.put("activestatus", activestatus);

        return parameter;
    }


    private static Map<String, String> inputMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("멤버의 생일을 입력하세요 : ");
        String birthdate = sc.nextLine();
        System.out.print("멤버의 거주지를 입력하세요 : ");
        String detailinfo = sc.nextLine();
        System.out.print("멤버의 전화번호를 입력하세요 : ");
        String contact = sc.nextLine();
        System.out.print("멤버의 등록여부를 입력하세요 Y/N : ");
        String activestatus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("birthdate", birthdate);
        parameter.put("detailinfo", detailinfo);
        parameter.put("contact", contact);
        parameter.put("activestatus", activestatus);

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
