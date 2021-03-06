package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    @ResponseBody
    public Book getBookById(){
        return bookService.getBookById(2);
    }

    @RequestMapping("/insertBook")
    @ResponseBody
    public Integer insertBook(){
        Book book=new Book();
        book.setBookName("三国演义");
        book.setBookAuthor("罗贯中");
        book.setBookIsbn("54541321");
        book.setBookStatus("未借");
        bookService.insertBook(book);
        return 1;
    }
}
