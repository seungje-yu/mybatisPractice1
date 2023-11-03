package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 뷰 (View): 뷰는 사용자에게 정보를 표시하는 역할을 합니다.
웹 페이지, 화면 또는 UI 구성 요소를 나타내며 모델의 데이터를 표시하는 역할을 합니다.
뷰는 사용자 인터페이스(UI)를 생성하고 모델의 데이터를 표시합니다. */
public class MemberView {
    MemberController memberController = new MemberController();

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

        // 프로그램의 인터페이스 정보 출력
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. 멤버 전체 조회");      // 조회 -> controller -> service -> DTO -> Template ->
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1: memberController.selectAllMember();
                    break;
                case 2: memberController.codeSelectMember(inputMemberCode());
                    break;
                case 3: memberController.addNewMember(inputMember());
                    break;
                case 4: memberController.insertMember(inputModifyMember());
                    break;
                case 5: memberController.deleteMember(inputMemberCode());
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }


        }while (true);
    }

    private Map<String, String> inputMemberCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        System.out.print(code);

        return parameter;
    }

    private static Map<String, String>
    inputMember() {

        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 이름을 입력하세요 : ");
                String name = sc.nextLine();

        System.out.print("멤버 생일을 입력하세요 : ");
        String birth = sc.nextLine();

        System.out.print("멤버 지역을 입력하세요 : ");
        String info = sc.nextLine();

        System.out.print("전화번호를 입력하세요 : ");
        String contact = sc.nextLine();

        System.out.print("상태를 입력하세요 : ");
        String status = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("birth", birth);
        parameter.put("info", info);
        parameter.put("contact", contact);
        parameter.put("status", status);

        return parameter;
    }
    private static Map<String, String> inputModifyMember() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        System.out.print("수정할 멤버 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("수정할 멤버 생일을 입력하세요 : ");
        String birth = sc.nextLine();

        System.out.print("수정할 멤버 지역을 입력하세요 : ");
        String info = sc.nextLine();

        System.out.print("수정할 멤버 전화번호를 입력하세요 : ");
        String contact = sc.nextLine();

        System.out.print("수정할 멤버 상태를 입력하세요 : ");
        String status = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("birth", birth);
        parameter.put("info", info);
        parameter.put("contact", contact);
        parameter.put("status", status);

        return parameter;
    }
}