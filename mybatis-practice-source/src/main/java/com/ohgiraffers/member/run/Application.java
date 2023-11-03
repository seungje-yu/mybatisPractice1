package com.ohgiraffers.member.run;

import com.ohgiraffers.member.view.MemberView;

public class Application {

    public static void main(String[] args) {

        /* 실행용 클래스 */
        /* 제공된 패키지에 필요한 클래스를 생성하고 코드를 기입 */
        /* 데이터베이스 명 : memberdb
        *  아이디는 기존에 사용했던 ohgiraffers를 이용
        * */
        MemberView memberView=new MemberView();
        memberView.displayView();
    }
}
