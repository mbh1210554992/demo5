package com.example.demo.dao;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BookDao {
    Book getBookById(@Param("bookId") Integer bookId);
    Integer insertBook( Book book);
}
