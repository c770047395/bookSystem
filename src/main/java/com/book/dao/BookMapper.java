package com.book.dao;

import com.book.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookID") int id);
    //修改
    int updateBook(Books books);
    //查询
    Books queryBookById(@Param("bookID") int id);
    //查询全部
    List<Books> queryAllBook();

}
