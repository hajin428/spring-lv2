package com.sparta.library.entity;

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
}
