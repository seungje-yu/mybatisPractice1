package com.ohgiraffers.member.view;

import com.ohgiraffers.member.Controller.MemberController;
import com.sun.tools.javac.Main;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberView {
    Scanner sc = new Scanner(System.in);
    MemberController memberController = new MemberController();


    public void displayView() {
        do{
            System.out.println("============ 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            int no = sc.nextInt();

            switch (no){
                case 1 : memberController.selectAllMenu(); break;
                case 2 : memberController.selectMemberByCode(inputMemberCode()); break;
                case 3 : memberController.registMember(inputMember()); break;
                case 4 : memberController.modifyMenu(inputModifyMember());break;
                case 5 : memberController.deleteMember(inputMemberCode());break;
                default :
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                break;
            }
        }while (true);

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


    }

    private static Map<String, String> inputModifyMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 회원의 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.println("수정할 회원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("수정할 회원의 생일을 입력하세요 : ");
        String birthdate = sc.nextLine();
        System.out.println("수정할 회원의 지역을 입력하세요 : ");
        String info = sc.nextLine();
        System.out.println("수정할 회원의 연락처를 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String , String > parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("birthdate", birthdate);
        parameter.put("info", info);
        parameter.put("contact", contact);

        return parameter;
    }

    private static Map<String, String > inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("등록할 회원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("등록할 회원의 생일을 입력하세요 : ");
        String birthdate = sc.nextLine();
        System.out.println("등록할 회원의 지역을 입력하세요 : ");
        String info = sc.nextLine();
        System.out.println("등록할 회원의 연락처를 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String , String > parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("birthdate", birthdate);
        parameter.put("info", info);
        parameter.put("contact", contact);

        return parameter;


    }

    private static Map<String , String > inputMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String > parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;

    }
}
