package com.ohgiraffers.member.run;

import com.ohgiraffers.member.view.MemberView;

public class Application {

    public static void main(String[] args) {

        /* 실행용 클래스 */
        /* 제공된 패키지에 필요한 클래스를 생성하고 코드를 기입 */
        /* 데이터베이스 : memberdb
        *  아이디 : ohgiraffers
        * */

        MemberView memberView = new MemberView();
        memberView.displayView();

    }
}
