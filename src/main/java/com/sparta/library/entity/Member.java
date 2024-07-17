package com.sparta.library.entity;

import com.sparta.library.dto.MemberRequestDto;
import jakarta.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String name;

    private String gender;

    //@Column(unique = true) : 중복되지 않음
    @Column(unique = true)
    private String ssn;

    @Column(unique = true)
    private String phoneNumber;

    private String address;


    public Member(MemberRequestDto memberRequestDto) {
        this.memberId = memberRequestDto.getMemberId();
        this.name = memberRequestDto.getName();
        this.gender = memberRequestDto.getGender();
        this.ssn = memberRequestDto.getSsn();
        this.phoneNumber = memberRequestDto.getPhoneNumber();
        this.address = memberRequestDto.getAddress();
    }


    public Member() {}

    public Long getMemberId() {
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
