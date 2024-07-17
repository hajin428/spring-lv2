package com.sparta.library.dto;

public class MemberRequestDto {
    private Long memberId;
    private String name;
    private String gender;
    private String ssn;
    private String phoneNumber;
    private String address;



    public  Long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getSsn() {
        return ssn;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
