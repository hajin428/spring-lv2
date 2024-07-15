package com.sparta.library.dto;

public class BookRequestDto {

    private String title;
    private String author;
    private String language;
    private String publisher;


    //공개적으로 접근 가능하고 string 타입으로 반환
    //get: 메서드가 특정 필드값을 반환하는 접근자 메서드
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getLanguage(){
        return language;
    }

    public String getPublisher(){
        return publisher;
    }
}
