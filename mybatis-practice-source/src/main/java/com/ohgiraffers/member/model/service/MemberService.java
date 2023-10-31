package com.ohgiraffers.member.model.service;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.model.mapper.MemberMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.model.service.Template.getSqlSession;

public class MemberService {
    public List<MemberDTO> selectAllMember() {

        SqlSession sqlSession = getSqlSession();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        List<MemberDTO> memberList = memberMapper.selectAllMember();

        sqlSession.close();

        return memberList;
    }
}
