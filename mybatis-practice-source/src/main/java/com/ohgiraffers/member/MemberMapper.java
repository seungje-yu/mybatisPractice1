package com.ohgiraffers.member;

import com.ohgiraffers.member.model.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();
    MemberDTO selectMemberByCode(int code);

    int insertMember(MemberDTO member);

    int updateMember(MemberDTO member);

    int deleteMember(int code);
}
