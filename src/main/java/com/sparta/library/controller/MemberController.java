package com.sparta.library.controller;


import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.dto.MemberRequestDto;
import com.sparta.library.dto.MemberResponseDto;
import com.sparta.library.service.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {


    private final MemberService memberService;
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //회원 가입
    @PostMapping ("/sign")
    public MemberResponseDto signMember(@RequestBody MemberRequestDto memberRequestDto) {
        return memberService.signMember(memberRequestDto);
    }
}
