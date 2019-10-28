package com.book.dao;

import com.book.pojo.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper {

    public int addBook(Books books) {
        return getSqlSession().getMapper(BookMapper.class).addBook(books);
    }

    public int deleteBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).deleteBookById(id);
    }

    public int updateBook(Books books) {
        return getSqlSession().getMapper(BookMapper.class).updateBook(books);
    }

    public Books queryBookById(int id) {
        return getSqlSession().getMapper(BookMapper.class).queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return getSqlSession().getMapper(BookMapper.class).queryAllBook();
    }
}
