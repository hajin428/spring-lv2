package com.sparta.library.service;

import com.sparta.library.dto.MemberRequestDto;
import com.sparta.library.dto.MemberResponseDto;
import com.sparta.library.entity.Member;
import com.sparta.library.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {


    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    //회원 가입
    public MemberResponseDto signMember(MemberRequestDto memberRequestDto) {
        Member member = new Member(memberRequestDto);
        memberRepository.save(member);
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        return memberResponseDto;
    }

}
