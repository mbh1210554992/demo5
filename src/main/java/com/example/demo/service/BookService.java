package com.example.demo.service;

import com.example.demo.entity.Book;

public interface BookService {
    Book getBookById(Integer bookId);
    void insertBook(Book book);

}
