package com.ohgiraffers.member.model.dao;

import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMembers();

    MemberDTO selectMemberByMemberCode(int memberCode);

    int insertMember(MemberDTO member);

    int updateMember(MemberDTO member);

    int deleteMember(int memberCode);
}
