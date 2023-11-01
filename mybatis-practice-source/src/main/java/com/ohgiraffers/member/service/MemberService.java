package com.ohgiraffers.member.service;

import com.ohgiraffers.member.dto.MemberDTO;
import com.ohgiraffers.member.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {
    public static List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = memberMapper.selectAllMember();

        sqlSession.close();

        return memberList;
    }

    public static MemberDTO selectByMemberCode(int code) {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        MemberDTO memberList = memberMapper.selectByMemberCode(code);

        sqlSession.close();

        return memberList;
    }

    public static boolean insertMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.insertMember(member);

        if (result > 0 ){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

    public static boolean modifyMember(MemberDTO member) {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.modifyMember(member);

        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public static boolean deleteMember(int code) {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.deleteMember(code);

        if (result > 0) {
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }
}
