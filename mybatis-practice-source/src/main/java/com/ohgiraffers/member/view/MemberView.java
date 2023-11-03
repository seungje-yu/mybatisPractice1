package com.ohgiraffers.member.view;

import com.ohgiraffers.member.run.MemberController;

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
            System.out.println("======= 멤버 관리 ========");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.print("멤버 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no){
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectMemberCode(inputMemberCode()); break;
                case 3 : memberController.insertMember(inputMember()); break;
                case 4 : memberController.upDateMember(inputUpdateMember()); break;
                case 5 : memberController.deleteMember(inputMemberCode()); break;

                default:
                    System.out.println("잘못된 멤버를 선택하셨습니다.");
            }
        }while (true);


    }

    private Map<String, String> inputUpdateMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.println("수정할 멤버 이름 : ");
        String name = sc.nextLine();
        System.out.println("수정할 멤버 출생일 : ");
        String birthDate = sc.nextLine();
        System.out.println("수정할 멤버 상세정보 : ");
        String detailInfo = sc.nextLine();
        System.out.println("수정할 멤버 연락처 : ");
        String contact = sc.nextLine();
        System.out.println("멤버 활동상태 : ");
        String activeStatus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("birthDate", birthDate);
        parameter.put("detailInfo", detailInfo);
        parameter.put("contact", contact);
        parameter.put("activeStatus", activeStatus);

        return parameter;
    }

    private Map<String, String> inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("멤버 이름 : ");
        String name = sc.nextLine();
        System.out.println("멤버 출생일 : ");
        String birthDate = sc.nextLine();
        System.out.println("멤버 상세정보 : ");
        String detailInfo = sc.nextLine();
        System.out.println("멤버 연락처 : ");
        String contact = sc.nextLine();
        System.out.println("멤버 활동상태 : ");
        String activeStatus = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("birthDate", birthDate);
        parameter.put("detailInfo", detailInfo);
        parameter.put("contact", contact);
        parameter.put("activeStatus", activeStatus);

        return parameter;
    }

    public static Map<String, String> inputMemberCode(){
        Scanner sc = new Scanner(System.in);
        System.out.println("멤버 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        return parameter;
    }
}
