package com.ohgiraffers.member.service;

import com.ohgiraffers.member.dto.MemberDTO;
import com.ohgiraffers.member.etc.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

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
        List<MemberDTO> memberDTOList = memberMapper.selectAllMember();

        sqlSession.close();

        return memberDTOList;
    }

    public boolean insertMember(MemberDTO memberDTO) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper menuMapper = sqlSession.getMapper(MemberMapper.class);
        int result = menuMapper.insertMember(memberDTO);

        if (result > 0) {
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean updateMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper menuMapper = sqlSession.getMapper(MemberMapper.class);
        int result = menuMapper.insertMember(memberDTO);

        if (result > 0) {
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteMember(int code) {

        SqlSession sqlSession = getSqlSession();
        MemberMapper menuMapper = sqlSession.getMapper(MemberMapper.class);
        int result = menuMapper.deleteMember(code);

        if (result > 0) {
            sqlSession.commit();
        } else{
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
