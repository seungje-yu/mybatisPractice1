package com.ohgiraffers.member.model.mapper;

import com.ohgiraffers.member.model.dto.MemberDTO;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();
}
