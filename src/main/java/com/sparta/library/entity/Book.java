package com.sparta.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity //엔티티로 지정
public class Book {

    @Id //id 필드를 기본키로 지정
    //@GeneratedValue: 엔티티 클래스에서 기본키를 자동으로 생성해줌
    //GenerationType.IDENTITY : 기본 키 값을 자동으로 증가
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String language;
    private String publisher;
    private Date registrationDate;
    private boolean Loaned;
}
