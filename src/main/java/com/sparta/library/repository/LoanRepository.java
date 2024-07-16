package com.sparta.library.repository;


import com.sparta.library.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    //회원 식별값으로 조건조회
    boolean existsByMemberIdAndReturnedFalse(Long memberId);

    //도서 식별값으로 조건조회
    boolean existsByBookIdAndReturnedFalse(Long bookId);

    //
    List<Loan> findByMemberIdOrderByLoanDateAsc(Long memberId);
}