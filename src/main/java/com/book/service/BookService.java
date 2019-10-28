package com.book.service;

import com.book.pojo.Books;

import java.util.List;

public interface BookService {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(int id);
    //修改
    int updateBook(Books books);
    //查询
    Books queryBookById(int id);
    //查询全部
    List<Books> queryAllBook();
}
