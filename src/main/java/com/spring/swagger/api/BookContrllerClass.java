package com.spring.swagger.api;
import com.spring.swagger.model.Book;
import com.spring.swagger.service.BookServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/book")
public class BookContrllerClass {
    @Autowired
    private BookServiceClass service;
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book)
    {
        service.addBookDetails(book);
        return "Book Added";
    }
   @GetMapping("/getBook/{bookId}")
    public Book getBookById(@PathVariable int bookId)
    {

        return service.getBook(bookId);
    }
    @GetMapping("/getBooks")
    public List<Book> getBooksFromDB()
    {
       return service.getAllBooks();
    }
    @DeleteMapping("/deleteBooks/{bookId}")
   public List<Book> deleteBook(@PathVariable int bookId)
    {
        return service.deleteBookById(bookId);
    }

    @GetMapping("getBookByName/{name}")
    public List<Book> getBookName(@PathVariable String name)
    {
        return service.getBookByNAme(name);
    }
}
