package com.ohgiraffers.member.service;

import com.ohgiraffers.member.model.dao.MemberMapper;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.template.getSqlSession;

public class MemberService {
    public static MemberDTO selectMemberByCode(int code) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        MemberDTO memberDTO = memberMapper.selectMemberByCode(code);

        sqlSession.close();
        return memberDTO;

    }

    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        List<MemberDTO> memberList = memberMapper.selectAllMember();

        sqlSession.close();
        return memberList;

    }

    public boolean insertMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.insertMember(member);
        if(result > 0 ){
            sqlSession.commit();

        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }

    public boolean modifyMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.updateMember(member);
        if(result > 0 ){
            sqlSession.commit();

        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }

    public boolean deleteMember(int member) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.deleteMember(member);
        if(result > 0 ){
            sqlSession.commit();

        }else{
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }
}
