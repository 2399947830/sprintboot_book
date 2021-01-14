package com.fh.service.impl;

import com.fh.entity.po.Book;
import com.fh.entity.vo.BookParamsVO;
import com.fh.mapper.BookMapper;
import com.fh.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;


    @Override
    public void addBookInfo(Book book) {
        bookMapper.addBookInfo(book);
    }

    @Override
    public void delBookInfo(Integer id) {
        bookMapper.delBookInfo(id);
    }

   /* @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public Book updateBookInfo(Book book) {
        return bookMapper.updateBookInfo(book);
    }*/

    @Override
    public Map<String, Object> queryBookPageData(BookParamsVO vo) {
        Map<String, Object> map = new HashMap<>();
        //查询总条数
        Integer integer = bookMapper.queryBookCount(vo);
        map.put("count",integer);
        //查询分页数据
        List<Book> bookList = bookMapper.queryBookDataByVo(vo);
        map.put("list",bookList);
        return map;
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer id) {
        return bookMapper.queryBookById(id);
    }

}
