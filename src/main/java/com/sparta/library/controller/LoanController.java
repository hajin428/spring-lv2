package com.sparta.library.controller;

import com.sparta.library.dto.LoanRequestDto;
import com.sparta.library.dto.LoanResponseDto;
import com.sparta.library.service.LoanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    //선택 도서 대출
    @PostMapping
    public String createLoan(@RequestBody LoanRequestDto loanRequestDto) {
        return loanService.createLoan(loanRequestDto);
    }

    //선택 도서 반납
    @PostMapping("/return/{loanId}")
    public String returnBook(@PathVariable Long loanId) {
        return loanService.returnBook(loanId);
    }

    //대출 내역 조회
    @GetMapping("/history/{memberId}")
    public List<LoanResponseDto> getLoanHistory(@PathVariable Long memberId) {
        return loanService.getLoanHistory(memberId);
    }
}
