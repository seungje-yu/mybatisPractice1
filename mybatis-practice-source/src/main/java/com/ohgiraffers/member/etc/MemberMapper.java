package com.ohgiraffers.member.etc;

import com.ohgiraffers.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {

    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberByCode(int code);

    int insertMember(MemberDTO memberDTO);

    int deleteMember(int code);
}
