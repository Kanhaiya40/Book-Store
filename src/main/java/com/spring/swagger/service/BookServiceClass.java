package com.spring.swagger.service;

import com.spring.swagger.dao.BookRepo;
import com.spring.swagger.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceClass {
    @Autowired
    private BookRepo bookDao;

    public Book addBookDetails(Book b)
    {
       return  bookDao.save(b);
    }


   public Book getBook(int bookId)

    {

       return bookDao.findByBookId(bookId);

    }


    public List<Book> getAllBooks()
    {
        return bookDao.findAll();
    }

    public List<Book> deleteBookById(int bookId)
    {
         bookDao.delete(bookId);
         return bookDao.findAll();
    }

    public List<Book> getBookByNAme(String name)
    {
       return bookDao.findAllByBookName(name);
    }



}
