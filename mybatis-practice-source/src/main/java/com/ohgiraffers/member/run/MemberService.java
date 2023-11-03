package com.ohgiraffers.member.run;

import com.ohgiraffers.member.DTO.MemberDTO;
import com.ohgiraffers.member.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {
    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        //매퍼 객체를 얻는 방법이다 여기서 Membermapper.class는 클래스 리터럴을 사용하여 클래스를 참조하는 방법이다
        List<MemberDTO> memberList = memberMapper.selectAllMember();

        sqlSession.close();
        return memberList;
    }

    public MemberDTO selectMemberByCode(int code) {
        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        MemberDTO member = memberMapper.selectMemberByCode(code);
        sqlSession.close();
        return member;
    }

    public boolean insertMember(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.insertMember(member);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }


    public boolean updateMember(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.updateMember(member);
        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }


    public boolean deleteMember(int code) {
        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.deleteMember(code);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }
}
