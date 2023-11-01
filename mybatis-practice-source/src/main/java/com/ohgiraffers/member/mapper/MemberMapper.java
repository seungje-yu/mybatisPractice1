package com.ohgiraffers.member.mapper;

import com.ohgiraffers.member.model.dto.MemberDTO;


import java.util.List;
import java.util.Map;

public interface MemberMapper {

    List<MemberDTO> selectAllMember();

    List<MemberDTO> selectMemberCode(Map<String, String> parameter);

    int registMember(MemberDTO newMember);

    int modifyMember(MemberDTO modifyMember);

    int deleteMember(MemberDTO deleteMember);

//    void registMember(MemberDTO newMember);
}
