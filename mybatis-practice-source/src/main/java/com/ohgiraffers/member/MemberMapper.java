package com.ohgiraffers.member;

import com.ohgiraffers.member.DTO.MemberDTO;
//import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {

    // mix 버전은 리턴타입과 key만 써줌

    // 1
    List<MemberDTO> selectAllMember();

    // 2
    MemberDTO selectMemberByCode(int code);

    int insertNewMember(MemberDTO member);

    int updateMember(MemberDTO member);

    int deleteMember(int code);
}
