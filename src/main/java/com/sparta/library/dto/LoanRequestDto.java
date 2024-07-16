package com.sparta.library.dto;

public class LoanRequestDto {

    private Long bookId;
    private Long memberId;



    public LoanRequestDto(Long bookId, Long memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public Long getBookId() {
        return bookId;
    }

    public Long getMemberId() {
        return memberId;
    }
}
