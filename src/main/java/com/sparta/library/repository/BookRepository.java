package com.sparta.library.repository;


import com.sparta.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //레포지토리로 지정
//jpa레포지토리를 상속 받을 때 해당 entity와 ID 타입을 넣어줌
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByOrderbyCreateDateAsc();
}