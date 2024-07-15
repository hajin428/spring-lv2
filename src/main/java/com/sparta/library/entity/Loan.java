package com.sparta.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Loan {

    @Id
    private String id;
    private String bookId;
    private String memberId;
    private boolean Returned;
    private Date loanDate;
    private Date returnDate;


}
