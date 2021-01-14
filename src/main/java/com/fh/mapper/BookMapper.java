package com.fh.mapper;

import com.fh.entity.po.Book;
import com.fh.entity.vo.BookParamsVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    public Integer queryBookCount(BookParamsVO vo);

    public List<Book> queryBookDataByVo(BookParamsVO vo);

    public void addBookInfo(Book book);

    public void delBookInfo(Integer id);

    @Update("update t_book set name=#{name},price=#{price},type=#{type},peoples=#{peoples},createdate=#{createDate},area=#{area} where id=#{id}")
    void updateBook(Book book);

    @Select("select * from t_book where id =#{id}")
    Book queryBookById(Integer id);

    /*
    @Select("select * from t_book where id = #{id}")
    Book getBookById(Integer id);


    @Update("update t_book set name=#{name},price=#{price},peoples=#{peoples},type=#{type},area=#{area} where id = #{id}")
    Book updateBookInfo(Book book);*/


}
