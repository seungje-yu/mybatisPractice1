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
        Scanner sc=new Scanner(System.in);
        MemberController memberController=new MemberController();
        do{
            System.out.println("============ 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("==========================================");
            int no=sc.nextInt();

            switch(no) {
                case 1: memberController.selectAllMember(); break;
                case 2: memberController.selectMemberByCode(inputMemberCode()); break;
                case 3: memberController.registMember(inputMember()); break;
                case 4: memberController.modifyMember(inputModifyMember()); break;
                case 5: memberController.deleteMember(inputMemberCode()); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");

            }
        }while(true);
    }

    private static Map<String,String> inputMemberCode() {
        Scanner sc=new Scanner(System.in);
        System.out.print("회원 번호를 입력하세요 : ");
        String memberNo=sc.nextLine();
        Map<String,String> parameter=new HashMap<>();
        parameter.put("memberNo",memberNo);

        return parameter;
    }

    private static Map<String,String> inputMember() {
        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String memberName=sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        String gender=sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        String age=sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address=sc.nextLine();
        System.out.print("전화번호를 입력하세요 : ");
        String phoneNum=sc.nextLine();

        Map<String,String> parameter=new HashMap<>();
        parameter.put("memberName",memberName);
        parameter.put("gender",gender);
        parameter.put("age",age);
        parameter.put("address",address);
        parameter.put("phoneNum",phoneNum);

        return parameter;
    }

    private static Map<String,String> inputModifyMember() {
        Scanner sc=new Scanner(System.in);
        System.out.print("수정할 회원 번호를 입력하세요 : ");
        String memberNo=sc.nextLine();
        System.out.print("수정할 회원 이름을 입력하세요 : ");
        String memberName=sc.nextLine();
        System.out.print("수정할 회원 성별을 입력하세요 : ");
        String gender=sc.nextLine();
        System.out.print("수정할 회원 나이를 입력하세요 : ");
        String age=sc.nextLine();
        System.out.print("수정할 회원의 주소를 입력하세요 : ");
        String address=sc.nextLine();
        System.out.print("수정할 회원 전화번호를 입력하세요 : ");
        String phoneNum=sc.nextLine();

        Map<String,String> parameter=new HashMap<>();
        parameter.put("memberNo",memberNo);
        parameter.put("memberName",memberName);
        parameter.put("gender",gender);
        parameter.put("age",age);
        parameter.put("address",address);
        parameter.put("phoneNum",phoneNum);

        return parameter;

    }
}
