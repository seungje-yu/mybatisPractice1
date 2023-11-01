package com.ohgiraffers.member.model.service;

import com.ohgiraffers.member.model.dao.MemberMapper;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {

    public List<MemberDTO> selectAllMembers() {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        List<MemberDTO> memberList = memberMapper.selectAllMembers();
        sqlSession.close();
        return memberList;
    }

    public MemberDTO selectMemberByMemberCode(int memberCode) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        MemberDTO member = memberMapper.selectMemberByMemberCode(memberCode);
        sqlSession.close();
        return member;
    }

    public boolean insertMember(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.insertMember(member);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean updateMember(MemberDTO member) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.updateMember(member);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }

    public boolean deleteMember(int memberCode) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.deleteMember(memberCode);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0;
    }
}
