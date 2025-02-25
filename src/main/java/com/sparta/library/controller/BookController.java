package com.sparta.library.controller;

import com.sparta.library.dto.BookListResponseDto;
import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.dto.BookSelectResponseDto;
import com.sparta.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Rest 컨트롤러 선언
@RestController
//중복되는 코드 매핑
@RequestMapping ("/book")
public class BookController {

    //bookService 필드 선언 (의존성 주입)
    //의존성 주입(DI): 필요한 객체를 직접 생성하지 않고 외부로부터 주입 받아 사용하는 디자인 패턴
    private final BookService bookService;
    //bookService를 매개변수로 받는 생성자 정의
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }


    //도서 등록
    // "/book" 경로의 post 요청 처리
    @PostMapping
    //요청된 json 타입의 body 데이터를 BookRequestDto 객체로 변환하여 받음
    public BookResponseDto createBook(@RequestBody BookRequestDto bookrequestDto) {
        //bookService 클래스의 createBook 메서드를 실행한 후 BookResponse 객체로 반환
        return bookService.createBook(bookrequestDto);
    }


    //도서 목록 전체 조회
    @GetMapping ("/list")
    //List 타입으로 반환
    public List<BookListResponseDto> findAll() {
        return bookService.getFindAll();
    }


    //게시글 선택 조회
    @GetMapping("/{id}")
    public BookSelectResponseDto getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

}
