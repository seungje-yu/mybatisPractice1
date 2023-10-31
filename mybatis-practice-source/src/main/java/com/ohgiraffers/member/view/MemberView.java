package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MemberView {
    MemberController memberController;

    public MemberView() {
        memberController=new MemberController();
    }

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

        do{
            System.out.println("===== 멤버 관리 =====");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.println("===================");
            System.out.print("메뉴를 입력해 주세요 : ");
            Scanner sc = new Scanner(System.in);
            try {
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        memberController.selectAllMembers();
                        break;
                    case 2:
                        memberController.selectMemberByMemberCode(inputMemberCode());
                        break;
                    case 3:
                        memberController.insertMember(inputMember());
                        break;
                    case 4:
                        memberController.updateMember(modifyMember());
                        break;
                    case 5:
                        memberController.deleteMember(inputMemberCode());
                        break;
                    default:
                        System.out.println("잘못 입력했습니다. 메뉴로 돌아갑니다.");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("숫자가 아닌 값을 입력했습니다. 메뉴로 돌아갑니다.");
            }
        }while(true);
    }

    private Map<String,String> modifyMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 멤버 코드를 입력하세요 : ");
        String memberCode = sc.nextLine();
        System.out.print("변경할 멤버 이름을 입력하세요 : ");
        String memberName = sc.nextLine();
        System.out.print("변경할 멤버 생일을 입력하세요(ex: 98/04/21) : ");
        String birthDate = sc.nextLine();
        System.out.print("변경할 멤버의 거주지를 입력하세요(ex: 서울시) : ");
        String detailInfo = sc.nextLine();
        System.out.print("변경할 멤버 전화번호를 입력하세요(ex: 010-1234-5678) : ");
        String contact = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode",memberCode);
        parameter.put("memberName",memberName);
        parameter.put("birthDate",birthDate);
        parameter.put("detailInfo",detailInfo);
        parameter.put("contact",contact);
        return parameter;
    }

    private Map<String,String> inputMember() {
        Scanner sc = new Scanner(System.in);
        System.out.print("추가할 멤버 이름을 입력하세요 : ");
        String memberName = sc.nextLine();
        System.out.print("추가할 멤버 생일을 입력하세요(ex: 98/04/21) : ");
        String birthDate = sc.nextLine();
        System.out.print("추가할 멤버의 거주지를 입력하세요(ex: 서울시) : ");
        String detailInfo = sc.nextLine();
        System.out.print("추가할 멤버 전화번호를 입력하세요(ex: 010-1234-5678) : ");
        String contact = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberName",memberName);
        parameter.put("birthDate",birthDate);
        parameter.put("detailInfo",detailInfo);
        parameter.put("contact",contact);
        return parameter;
    }

    private Map<String, String> inputMemberCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("멤버 코드를 입력하세요 : ");
        String memberCode = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("memberCode",memberCode);
        return parameter;
    }
}
