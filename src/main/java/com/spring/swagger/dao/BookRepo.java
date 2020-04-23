package com.spring.swagger.dao;
import com.spring.swagger.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findByBookId(int bookId);
    List<Book> findAllByBookName(String name);
    List<Book> findAllByNoOfPageIsGreaterThanEqual(int num);
}
