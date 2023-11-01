package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;
import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.*;

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

        MemberController memberController = new MemberController();
        Scanner sc = new Scanner(System.in);

//        //회원 전체 조회결과를 리스트로 받아오자
//
//        List<MemberDTO> memberList = new ArrayList<>();

        do {
            System.out.println("============ 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.println("==========================================");

            int num = sc.nextInt();
            switch (num){
                case 1 : memberController.selectAllMember(); break;
                case 2 : memberController.selectMemberCode(inputCode()); break;
                case 3 : memberController.registMember(); break;
                case 4 : memberController.modifyMember(inputModifyCode()); break;
                case 5 : memberController.deleteMember(inputdeleteCode()); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }



        }while(true);
    }

    private Map<String, String> inputdeleteCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("삭제하실 멤버 코드를 입력해주세요 : ");
        String code = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    private Map<String, String> inputModifyCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정하실 멤버 코드를 입력해주세요 : ");
        String code = sc.nextLine();
        System.out.print("수정할 회원 이름 : ");
        String name = sc.nextLine();
        System.out.print("생년월일 수정 YY/MM/DD 형식으로 : ");
        String birthDate = sc.nextLine();
        System.out.print("도시 수정 : ");
        String address = sc.nextLine();
        System.out.print("전화번호 수정 : ");
        String phone = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("birthDate", birthDate);
        parameter.put("address", address);
        parameter.put("phone", phone);

        return parameter;
    }

    private Map<String, String> inputCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 멤버 코드를 입력해주세요 : ");
        String code = sc.nextLine();


        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    // "1" 문자형식을 숫자로 자료형 바꿔주는 것이 파싱.
}
