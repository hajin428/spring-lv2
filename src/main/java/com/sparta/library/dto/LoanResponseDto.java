package com.sparta.library.dto;

import com.sparta.library.entity.Loan;

import java.util.Date;

public class LoanResponseDto {

    private Long loanId;
    private Long bookId;
    private Long memberId;
    private boolean returned;
    private Date loanDate;
    private Date returnDate;




    public LoanResponseDto(Loan loan) {
        this.loanId = loan.getLoanId();
        this.bookId = loan.getBookId();
        this.memberId = loan.getMemberId();
        this.returned = loan.isReturned();
        this.loanDate = loan.getLoanDate();
        this.returnDate = loan.getReturnDate();
    }


    public Long getLoanId() {
        return loanId;
    }

    public Long getBookId() {
        return bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public boolean isReturned() {
        return returned;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

}
