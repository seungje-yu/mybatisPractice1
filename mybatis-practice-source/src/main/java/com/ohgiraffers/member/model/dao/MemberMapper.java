package com.ohgiraffers.member.model.dao;

import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberByCode(int code);



    int updateMember(MemberDTO member);

    int deleteMember(int member);

    int insertMember(MemberDTO member);
}
