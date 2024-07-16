package com.sparta.library.service;

import com.sparta.library.dto.AllBookResponseDto;
import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.entity.Book;
import com.sparta.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Service 클래스 선언
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //도서 등록
    public BookResponseDto createBook(BookRequestDto bookRequestDto) {
        //Book 엔티티에 bookRequestDto를 넣어줌
        Book book = new Book(bookRequestDto);
        //레포지토리에서 save 메서드 실행
        bookRepository.save(book);
        BookResponseDto bookResponseDto = new BookResponseDto(book);
        return bookResponseDto;
    }



    //도서 목록 전체 조회
    //List로 반환할 메서드 정의
    public List<AllBookResponseDto> getFindAll() {

        //레포지토리에서 오름차순(OrderByCreateDateAsc)으로 정렬한 목록 호출
        List<Book> books = bookRepository.findAllByOrderbyCreateDateAsc();

        //Dto List를 담을 ArrayList 생성
        List<AllBookResponseDto> allBookResponseDto = new ArrayList<>();

        //books 리스트에 있는 객체를 BookResponseDto를 이용해서 bookResponseDtos를 생성
        for (Book book : books) {
            allBookResponseDto.add(new AllBookResponseDto(book));
        }

        //List Dtos를 반환
        return allBookResponseDto;
    }



    //도서 선택 조회
    //Long bookId를 파라미터로 받아서 실행하는 메서드 정의
    public BookResponseDto getBookById(Long bookId) {

        Book book = bookRepository.findById(bookId).orElseThrow(() ->
                new IllegalArgumentException("찾으시는 자료가 없습니다."));

        return new BookResponseDto(book);
    }


}
