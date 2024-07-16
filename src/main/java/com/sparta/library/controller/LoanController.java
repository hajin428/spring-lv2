package com.sparta.library.controller;

import com.sparta.library.service.BookService;
import com.sparta.library.service.LoanService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanService loanService;
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
}
