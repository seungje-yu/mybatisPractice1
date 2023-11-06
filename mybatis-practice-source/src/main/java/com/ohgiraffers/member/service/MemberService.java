package com.ohgiraffers.member.service;

import com.ohgiraffers.member.model.dao.MemberMapper;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {


    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
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

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public boolean modifyMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper((MemberMapper.class));
        int result = memberMapper.updateMember(member);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return result > 0? true: false;


    }

    public boolean deleteMember(String name) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper menuMapper = sqlSession.getMapper(MemberMapper.class);
        int result = menuMapper.deleteMember(name);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }
}
