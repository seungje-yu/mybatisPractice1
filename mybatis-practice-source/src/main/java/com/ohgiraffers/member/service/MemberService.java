package com.ohgiraffers.member.service;

import com.ohgiraffers.member.mapper.MemberMapper;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.ohgiraffers.member.common.Template.getSqlSession;


public class MemberService {

    private MemberMapper memberMapper; //멤버매퍼 인터페이스 사용하기 위해 선언 인듯?
    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class); //여기 모르겠음

        List<MemberDTO> memberList = memberMapper.selectAllMember(); //여기도...ㅎ

        sqlSession.close();

        return memberList;
    }

    public List<MemberDTO> selectMemberCode(Map<String, String> parameter) {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

        List<MemberDTO> memberList = memberMapper.selectMemberCode(parameter);

        sqlSession.close();

        return memberList;
    }

    public void registMember(MemberDTO newMember) {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

//        memberMapper.registMember(newMember);

        int result = memberMapper.registMember(newMember);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

    }

    public void modifyMember(MemberDTO modifyMember) {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.modifyMember(modifyMember);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();

    }

    public void deleteMember(MemberDTO deleteMember) {

        SqlSession sqlSession = getSqlSession();

        memberMapper = sqlSession.getMapper(MemberMapper.class);

        int result = memberMapper.deleteMember(deleteMember);

        if(result > 0){
            sqlSession.commit();
        }else{
            sqlSession.rollback();
        }

        sqlSession.close();
    }
}
