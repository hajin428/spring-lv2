package com.sparta.library.dto;

import com.sparta.library.entity.Book;


//도서 선택 조회 Dto
public class BookSelectResponseDto {
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;

    public BookSelectResponseDto(Book book) {
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
