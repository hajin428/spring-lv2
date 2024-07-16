package com.sparta.library.controller;

import com.sparta.library.dto.AllBookResponseDto;
import com.sparta.library.dto.BookRequestDto;
import com.sparta.library.dto.BookResponseDto;
import com.sparta.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Rest 컨트롤러 선언
@RestController
//중복되는 코드 매핑
@RequestMapping ("/book")
public class BookController {

    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    //도서 등록
    // "/book" 경로의 post 요청 처리
    @PostMapping
    //요청된 json 타입의 body 데이터를 BookRequestDto 객체로 받아서 변환하여 받음
    public BookResponseDto createBook(@RequestBody BookRequestDto requestDto) {
        //bookService 클래스의 createBook 메서드를 실행한 후 BookResponse 객체로 반환
        return bookService.createBook(requestDto);
    }

    //도서 목록 전체 조회
    @GetMapping ("/list")
    public List<AllBookResponseDto> findAll() {
        return bookService.getFindAll();
    }

    //게시글 선택 조회
    @GetMapping("/{id}")
    public BookResponseDto getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }



}
