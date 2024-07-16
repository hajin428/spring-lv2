package com.sparta.library.dto;

import com.sparta.library.entity.Book;


public class AllBookResponseDto {
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;

    public AllBookResponseDto(Book book) {
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
