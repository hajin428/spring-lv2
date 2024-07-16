package com.sparta.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    private Long bookId;

    private Long memberId;

    private boolean returned;

    private Date loanDate;

    private Date returnDate;



    public Loan(){}

    public Loan (Long bookId, Long memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.loanDate = new Date();
        this.returnDate = new Date();
        this.returned = false;
        //반납된 상태 true, 대출중 false
        //새로운 대출 내역이 생성될 때는 대출 중이기 때문에 false로 설정
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


    //선택 도서 반납
    public void returnBook() {
        //대출중일 떄 false이고 반납하면 true로 변경
        this.returned = true;
        //반납일
        this.returnDate = new Date();
    }

}
