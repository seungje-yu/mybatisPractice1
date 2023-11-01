package com.ohgiraffers.member.mapper;

import com.ohgiraffers.member.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {


    List<MemberDTO> selectAllMember();

    MemberDTO selectByMemberCode(int code);

    int insertMember(MemberDTO member);

    int modifyMember(MemberDTO member);

    int deleteMember(int code);
}
