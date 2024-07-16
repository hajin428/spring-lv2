package com.sparta.library.entity;

import com.sparta.library.dto.BookRequestDto;
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
    private Long bookId;

    private String title;
    private String author;
    private String language;
    private String publisher;
    private Date registrationDate;
    private boolean Loaned;

    public Book(BookRequestDto bookRequestDto) {
        this.title = bookRequestDto.getTitle();
        this.author = bookRequestDto.getAuthor();
        this.language = bookRequestDto.getLanguage();
        this.publisher = bookRequestDto.getPublisher();
    }


    public Book() {}
}

