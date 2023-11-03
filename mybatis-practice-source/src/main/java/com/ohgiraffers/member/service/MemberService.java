package com.ohgiraffers.member.service;

import com.ohgiraffers.member.MemberMapper;
import com.ohgiraffers.member.DTO.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {

    private MemberMapper memberMapper;

    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();
        memberMapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = memberMapper.selectAllMember();

        sqlSession.close();

        return memberList;

    }

    public MemberDTO selectMemberByCode(int code) {

        SqlSession sqlSession = getSqlSession();
        memberMapper = sqlSession.getMapper(MemberMapper.class);

        MemberDTO member = memberMapper.selectMemberByCode(code);

        sqlSession.close();

        return member;

    }

    public boolean insertNewMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberMapper = sqlSession.getMapper(MemberMapper.class);

        // 성공한 행의 개수 반환
        int result = memberMapper.insertNewMember(member);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }

    public boolean updateMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        memberMapper = sqlSession.getMapper(MemberMapper.class);

        // 성공한 행의 개수 반환
        int result = memberMapper.updateMember(member);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;


    }

    public boolean deleteMember(int code) {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.deleteMember(code);
        System.out.println("result = " + result);

        if(result > 0){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }
}
