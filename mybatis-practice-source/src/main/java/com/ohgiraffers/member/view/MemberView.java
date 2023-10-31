package com.ohgiraffers.member.view;

import com.ohgiraffers.member.controller.MemberController;

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
            System.out.println("==================== 멤버 관리 ====================");
            System.out.println("1. 멤버 전체 조회");
            System.out.println("2. 멤버 코드로 멤버 조회");
            System.out.println("3. 신규 멤버 추가");
            System.out.println("4. 멤버 수정");
            System.out.println("5. 멤버 삭제");
            System.out.print("멤버 관리 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    memberController.selectAllMember();
                    break;
            }
        } while (true);
    }
}
