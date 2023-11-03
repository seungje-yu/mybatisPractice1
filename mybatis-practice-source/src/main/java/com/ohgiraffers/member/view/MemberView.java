package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberView {

    public void displayView() {

        Scanner sc = new Scanner(System.in);
        MemberController memberController = new MemberController();
        do{
            System.out.println(" ================= 회원 관리 ====================");
            System.out.println("1. 회원 전체 조회");
            System.out.println("2. 회원 코드로 조회");
            System.out.println("3. 신규 회원 추가");
            System.out.println("4. 회원 수정");
            System.out.println("5. 회원 삭제");
            System.out.print("회원 관리 번호를 입력하세요 : ");

            int no = sc.nextInt();

            switch(no){
                case 1: memberController.selectAllMember();break;
                case 2: memberController.selectMemberByCode(inputMemberCode());break;
                case 3: memberController.registMemeber(inputMember()); break;
                case 4: memberController.modifyMember(inputModifyMember());break;
                case 5: memberController.deleteMember(inputMemberCode());break;

            }

        } while (true);



    }

    private static Map<String,String> inputModifyMember() {
        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 회원 코드를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.println("수정 할 회원의 이름 입력하세요 :");
        String name = sc.nextLine();
        System.out.println("수정 할 회원의 생년월일(YY/MM/DD) 입력하세요 : ");
        String birth = sc.nextLine();
        System.out.println("수정 할 회원의 주소(##시) 입력하세요 : ");
        String detail = sc.nextLine();
        System.out.println("수정 할 회원의 전화 번호(000-0000-0000) 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String,String>parameter = new HashMap<>();
        parameter.put("code",code);
        parameter.put("name",name);
        parameter.put("birth",birth);
        parameter.put("detail",detail);
        parameter.put("contact",contact);

        return parameter;
    }

    private Map<String,String> inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.println("추가 할 회원의 이름 입력하세요 :");
        String name = sc.nextLine();
        System.out.println("추가 할 회원의 생년월일(YY/MM/DD) 입력하세요 : ");
        String birth = sc.nextLine();
        System.out.println("추가 할 회원의 주소(##시) 입력하세요 : ");
        String detail = sc.nextLine();
        System.out.println("추가 할 회원의 전화 번호(000-0000-0000) 입력하세요 : ");
        String contact = sc.nextLine();

        Map<String,String>parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("birth",birth);
        parameter.put("detail",detail);
        parameter.put("contact",contact);

        return parameter;
    }

    private static Map<String,String> inputMemberCode() {
        Scanner sc= new Scanner(System.in);
        System.out.println("회원 코드를 입력하세요 : ");
        String code = sc.nextLine();
        Map<String,String>parameter = new HashMap<>();
        parameter.put("code",code);
        return parameter;
    }
}
