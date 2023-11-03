package com.ohgiraffers.member.run;

import com.ohgiraffers.member.controller.MemberController;
import com.ohgiraffers.member.view.MemberView;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 실행용 클래스 */
        /* 제공된 패키지에 필요한 클래스를 생성하고 코드를 기입 */
        /* 데이터베이스 명 : memberdb
        *  아이디는 기존에 사용했던 ohgiraffers를 이용
        * */

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


        MemberView memberView = new MemberView();
        memberView.displayView();







    }
}
