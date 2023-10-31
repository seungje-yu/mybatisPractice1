package com.ohgiraffers.member;

import com.ohgiraffers.member.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberByCode(int code);

    int insertMember(MemberDTO memberDTO);

    int modifyMember(MemberDTO memberDTO);

    int deleteMember(int code);
}
