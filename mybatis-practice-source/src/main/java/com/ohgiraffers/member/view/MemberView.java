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
            System.out.println("========맴버관리=========");
            System.out.println("1. 맴버 전체 조회");
            System.out.println("2. 맴버코드로 맴버조회");
            System.out.println("3. 신규 맴버 추가");
            System.out.println("4. 맴버정보 수정");
            System.out.println("5. 맴버정보 삭제");
            System.out.print("선택 할 번호를 입력하세요 : ");

            int no = sc.nextInt();

            switch (no){
                case 1: memberController.selectAllMember(); break;
                case 2: memberController.selectMemberByCode(inputMemberCode()); break;
                case 3: memberController.insertMember(inputMember()); break;
                case 4: memberController.updateMember(updateMember()); break;
                case 5: memberController.deleteMember(inputMemberCode()); break;
                default:
                    System.out.println("잘못된 매뉴를 선택하셨습니다."); break;

            }

        }while (true);



    }
    private static Map<String, String> updateMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 맴버 코드를 입력해주세요 : ");
        String code = sc.nextLine();
        System.out.print("수정할 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 생년월일을 입력해주세요. ex(YY/MM/DD) : ");
        String date = sc.nextLine();
        System.out.print("수정할 거주지를 입력해주세요 : ");
        String detail = sc.nextLine();
        System.out.print("수정할 전화번호를 입력해주세요 : ");
        String contact = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("date", date);
        parameter.put("detail", detail);
        parameter.put("contact", contact);

        return parameter;

    }

    private static Map<String, String> inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요. : ");
        String name = sc.nextLine();
        System.out.print("생년월일을 입력해주세요. ex (YY/MM/DD) : ");
        String date = sc.nextLine();
        System.out.print("거주지를 입력해주세요. ex 서울시, 대전시 : " );
        String detail = sc.nextLine();
        System.out.print("전화번호를 입력해주세요. ex 010-0000-0000 : ");
        String contact = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("date", date);
        parameter.put("detail", detail);
        parameter.put("contact", contact);

        return parameter;
    }

    private static Map<String, String> inputMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("코드를 입력해주세요 : ");
        String code = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("code" , code);

        return parameter;
    }
}
