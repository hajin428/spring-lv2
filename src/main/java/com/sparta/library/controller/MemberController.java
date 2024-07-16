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


    @PostMapping ("/member")
    //요청된 json 타입의 body 데이터를 BookRequestDto 객체로 받아서 변환하여 받음
    public MemberResponseDto createMember(@RequestBody MemberRequestDto memberRequestDto) {
        //bookService 클래스의 createBook 메서드를 실행한 후 BookResponse 객체로 반환
        return memberService.signMember(memberRequestDto);
    }
}
