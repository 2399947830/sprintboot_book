package com.fh.service;

import com.fh.entity.po.Book;
import com.fh.entity.vo.BookParamsVO;

import java.util.Map;

public interface BookService {

   void addBookInfo(Book book);

    void delBookInfo(Integer id);

     /*Book getBookById(Integer id);

    Book updateBookInfo(Book book);*/

    Map<String, Object> queryBookPageData(BookParamsVO vo);

    void updateBook(Book book);

    Book queryBookById(Integer id);
}
