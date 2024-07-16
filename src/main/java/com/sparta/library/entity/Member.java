package com.sparta.library.entity;

import com.sparta.library.dto.MemberRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {

    @Id
    private String memberId;

    private String name;

    private String gender;

    @Column(unique = true)
    private String ssn;

    @Column(unique = true)
    private String phoneNumber;

    private String address;


    public Member(MemberRequestDto memberRequestDto) {
        this.name = memberRequestDto.getName();
        this.gender = memberRequestDto.getGender();
        this.ssn = memberRequestDto.getSsn();
        this.phoneNumber = memberRequestDto.getPhoneNumber();
        this.address = memberRequestDto.getAddress();
    }

    public Member() {
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
