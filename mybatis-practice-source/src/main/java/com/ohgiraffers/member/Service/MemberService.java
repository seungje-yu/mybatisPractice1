package com.ohgiraffers.member.Service;

import com.ohgiraffers.member.MemberMapper;
import com.ohgiraffers.member.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.EnumSet;
import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {
    public List<MemberDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        List<MemberDTO> memberDTOList = memberMapper.selectAllMember();
        sqlSession.close();
        return memberDTOList;
    }

    public MemberDTO selectMemberByCode(int code) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        MemberDTO memberDTO = memberMapper.selectMemberByCode(code);
        sqlSession.close();
        return memberDTO;
    }

    public boolean insertMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.insertMember(memberDTO);
        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }

    public boolean modifyMember(MemberDTO memberDTO) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.modifyMember(memberDTO);
        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }

    public boolean deleteMenu(int code) {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        int result = memberMapper.deleteMember(code);
        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0? true : false;
    }
    }

