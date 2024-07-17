package com.sparta.library.dto;

import com.sparta.library.entity.Book;


//도서 전체 목록 조회 Dto

//ReponsDto를 분리해서 사용하는 이유
//각 메서드별로 필요한 필드만 포함해서 반환할 수 있음
//변경관리가 쉬워짐 (유지보수성..?)

public class BookListResponseDto {
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;


    public BookListResponseDto(Book book) {
        this.bookId = getBookId();
        this.title = getTitle();
        this.author = getAuthor();
        this.language = getLanguage();
        this.publisher = getPublisher();
        
    }


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
