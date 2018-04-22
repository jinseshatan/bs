package com.baizhi.common.dao;

import com.baizhi.common.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    public List<Book> selectAllBooks(@Param("page") Integer page,@Param("rows") Integer rows);

    public Integer selectBookCount();

    public void addBooks(Book book);

    public void deleteBook(String id);

    public void updateBook(Book book);

    public Book selectOne(String id);

    public void updatePhoto(@Param("photo") String path,@Param("id") String id);

    public void downBooks(@Param("sortId") String sortId,@Param("newSortId") String newSortId);

    public List<Book> allBooks();

    public List<Book> selectBooksBySortId(String sortId);

    public List<Book> selectByRacK(String userId);

    public List<Book> selectNameAndNum();

}
