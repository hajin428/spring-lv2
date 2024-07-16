package com.sparta.library.dto;

import com.sparta.library.entity.Book;

public class BookResponseDto {

    //비공개 필드
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;


//    //BookResponseDto의 인스턴스를 초기화
//    public BookResponseDto(Long bookId, String title, String author, String language, String publisher) {
//
//        //this(인스턴스화 된 객체).(인스턴스 변수) = 매개변수
//        this.bookId = bookId;
//        this.title = title;
//        this.author = author;
//        this.language = language;
//        this.publisher = publisher;
//    }

    //book 엔티티를 파라미터로 받는 생성자
    public BookResponseDto(Book book) {
        this.bookId = getBookId();
        this.title = getTitle();
        this.author = getAuthor();
        this.language = getLanguage();
        this.publisher = getPublisher();
    }


    //getBookId 메서드는 bookId를 반환
    //getter 메서드는 해당 값을 반환
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


//service 클래스는 Dto를 통해 데이터베이스에 접근함
