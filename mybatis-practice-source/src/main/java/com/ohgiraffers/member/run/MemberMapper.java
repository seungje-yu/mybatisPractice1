package com.ohgiraffers.member.run;

import java.util.List;

public interface MemberMapper {
    List<MemberDTO> selectAllMember();

    MemberDTO selectMemberByCode(int memberNo);
    
    int insertMember(MemberDTO member);

    int deleteMember(int memberNo);

    int updateMember(MemberDTO member);
}
