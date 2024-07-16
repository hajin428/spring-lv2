package com.sparta.library.service;

import com.sparta.library.dto.LoanRequestDto;
import com.sparta.library.dto.LoanResponseDto;
import com.sparta.library.entity.Loan;
import com.sparta.library.repository.BookRepository;
import com.sparta.library.repository.LoanRepository;
import com.sparta.library.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    //bookID, memberId가 필요하기 때문에 필드 3개 다 선언
    private final LoanRepository loanRepository;
    private final BookRepository bookRepository;
    private final MemberRepository memberRepository;

    //생성자
    public LoanService(LoanRepository loanRepository, BookRepository bookRepository, MemberRepository memberRepository) {
        this.loanRepository = loanRepository;
        this.bookRepository = bookRepository;
        this.memberRepository = memberRepository;
    }


    //선택 도서 대출
    //에러 메세지 반환해야 되기 때문에 반환값 String
    public String createLoan(LoanRequestDto loanRequestDto) {
        Long bookId = loanRequestDto.getBookId();
        Long memberId = loanRequestDto.getMemberId();

        //.existsBy : JPA 조건 조회 메서드
        //도서 식별값으로 returned 변수가 false인지 조회 (입력값 bookId)
        if (loanRepository.existsByBookIdAndReturnedFalse(bookId)) {
            return "도서가 이미 대출 중입니다."; //false일 때(대출 중일 떄) 반환 될 메세지
        }

        //회원 식별값으로 returned가 false인지 조회 (입력값 memberId)
        if (loanRepository.existsByMemberIdAndReturnedFalse(memberId)) {
            return "반납하지 않은 책이 있습니다."; //false일 때 메세지
        }

        //도서 식별값과 회원 식별값으로 Loan 객체 생성
        Loan loan = new Loan(bookId, memberId);
        //레포지토리에 저장
        loanRepository.save(loan);

        //위의 조건에 다 부합하지 않을 때 나올 메세지(도서 대출중x, 반납 안 한 도서x)
        return "대출이 성공적으로 완료되었습니다.";
    }



    //선택 도서 반납
    public String returnBook(Long loanId) {

        //Optional : 값이 존재하는 경우 해당 값을, 존재하지 않는 경우 null 값을 담고 있음
        Optional<Loan> optionalLoan = loanRepository.findById(loanId);

        //optionalLoan.isPresent(): 조회된 optional 객체에 값이 존재하는지 확인
        //앞에 ! <- 존재하지 않으면 반환
        if (!optionalLoan.isPresent()) {
            return "대출 기록을 찾을 수 없습니다.";
        }

        //optional 객체에 담겨있는 loan entity를 가져옴
        Loan loan = optionalLoan.get();
        //loan 엔티티의 retrunBook 메서드 실행
        loan.returnBook();
        //save 메서드로 변경된 loan 엔티티 레포지토리에 저장
        loanRepository.save(loan);

        return "도서가 성공적으로 반납되었습니다.";
    }



    //대출 내역 조회
    public List<LoanResponseDto> getLoanHistory(Long memberId) {

        //findById 메서드를 사용해서 오름차순으로 loan 엔티티 목록 조회
        List<Loan> loans = loanRepository.findByMemberIdOrderByLoanDateAsc(memberId);

        //LoanResponseDto 객체를 담을 리스트 생성
        List<LoanResponseDto> loanHistory = new ArrayList<>();

        //for문으로 loans 리스트에 담긴 엔티티 객체들을 responseDto로 변환해서 리스트에 추가해줌
        for (Loan loan : loans) {
            LoanResponseDto loanResponseDto = new LoanResponseDto(loan);
            //loanHistory 리스트에 추가
            loanHistory.add(loanResponseDto);
        }

        //loanHistory 리스트 반환
        return loanHistory;
    }
}
