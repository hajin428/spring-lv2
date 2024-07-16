package com.sparta.library.dto;

public class MemberResponseDto {
    private Long memberId;
    private String name;
    private String gender;
    private String phoneNumber;
    private String address;

    public MemberResponseDto(Long id, String name, String gender, String phoneNumber, String address) {
        this.memberId = memberId;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
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
