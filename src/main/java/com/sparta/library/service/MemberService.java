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

    //회원 등록
    public MemberResponseDto signMember(MemberRequestDto memberRequestDto) {
        //Book 엔티티에 bookRequestDto를 넣어줌
        Member member = new Member(memberRequestDto);
        //레포지토리에서 save 메서드 실행
        memberRepository.save(member);
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        return memberResponseDto;
    }

}
