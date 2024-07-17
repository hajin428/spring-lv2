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
    private Long bookId; //도서 식별값

    private String title; //제목

    private String author; //저자

    private String language; //언어

    private String publisher; //출판사




    public Book(BookRequestDto bookRequestDto) {
        this.title = bookRequestDto.getTitle();
        this.author = bookRequestDto.getAuthor();
        this.language = bookRequestDto.getLanguage();
        this.publisher = bookRequestDto.getPublisher();
    }


    //기본 생성자
    public Book() {}


    //
    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLanguage() {
        return language;
    }

    public String getPublisher() {
        return publisher;
    }

}

