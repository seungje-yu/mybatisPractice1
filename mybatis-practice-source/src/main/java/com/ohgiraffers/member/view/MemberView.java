package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.io.InputStream;
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
    }

        MemberController memberController = new MemberController();
        Scanner sc = new Scanner(System.in);
    public void viewDisplay() {

        do{
            System.out.println("==================== 멤버 관리 =====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("6. 메뉴 관리 번호를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num){
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectMemberByCode(InputMemberCode()); break;
                case 3 : memberController.registMember(InputMember()); break;
                case 4 : memberController.modifyMember(InputmodifyMember()); break;
                case 5 : memberController.deleteMember(InputMemberCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");

            }





        }while(true);
    }

    private static Map<String, String> InputmodifyMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 회원 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("수정할 회원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("수정할 회원 생일을 입력하세요 : ");
        String birth = sc.nextLine();
        System.out.print("수정할 주소를 입력하세요 : ");
        String info = sc.nextLine();
        System.out.print("수정할 전화번호를 입력하세요 : ");
        String cantact = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode", code);
        parameter.put("memberName", name);
        parameter.put("birthDate", birth);
        parameter.put("detailInfo", info);
        parameter.put("contact", cantact);

        return parameter;
    }

    private Map<String, String> InputMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 코드를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode", code);

        return parameter;
    }

    private static Map<String,String> InputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("회원 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("회원 생일을 입력하세요 : ");
        String birth = sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String info = sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String cantact = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberName", name);
        parameter.put("birthDate", birth);
        parameter.put("detailInfo", info);
        parameter.put("contact", cantact);

        return parameter;
    }
}
