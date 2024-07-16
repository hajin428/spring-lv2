package com.sparta.library.dto;

import com.sparta.library.entity.Member;

public class MemberResponseDto {
    private Long memberId;
    private String name;
    private String gender;
    private String phoneNumber;
    private String address;


    public MemberResponseDto(Member member) {
        this.name = member.getName();
        this.gender = member.getGender();
        this.phoneNumber = member.getPhoneNumber();
        this.address = member.getAddress();
    }


    public Long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
