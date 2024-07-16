package com.sparta.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Loan {

    @Id
    private String loanId;
    private String bookId;
    private String memberId;
    private boolean returned;
    private Date loanDate;
    private Date returnDate;

}
