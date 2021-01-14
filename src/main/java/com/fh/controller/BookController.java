package com.fh.controller;


import com.fh.entity.po.Book;
import com.fh.entity.vo.BookParamsVO;
import com.fh.service.BookService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/book")
@CrossOrigin
public class BookController {
    @Autowired
    private BookService bookService;

    /*
     * 查询书籍信息
     * 路径： http://localhost:8082/api/book/list
     * 请求方式 get
     *
     * 参数
     * currPage （当前页）  （必选）
     *
     * size （每页条数） （必选）
     *
     * name   (按照名字准确查询)  （可选项）
     *
     * bdate   出版时间  最小值  （可选）
     *
     * ddate   出版时间 最大值  （可选）
     *
     *
     * 返回值
     *  code  message  data
     *
     * */
    @PostMapping("list")
    @CrossOrigin
    public CommonsReturn list(BookParamsVO vo){
        /*  校验参数   可以用枚举  */
        if(vo.getCurrPage()==null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }

        if(vo.getSize()==null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        //处理参数
        if(!StringUtils.isEmpty(vo.getPeoples())){
            String[] split = vo.getPeoples().split(",");
            //数组直接转为list
            List<String> ps = Arrays.asList(split);
            vo.setPs(ps);
        }
        //处理业务了   查询书籍信息    书籍的currPage的数据   书籍的总条数  map  （list  count）
        Map rs = bookService.queryBookPageData(vo);
        return  CommonsReturn.success(rs);
    }
    /*
        添加书籍信息

    * 路径： http://localhost:8082/api/book/add
    * 请求方式 post
    *
    * 参数

    * 返回值
    *
     */
    @PostMapping("add")
    public CommonsReturn addBook(Book book){
        bookService.addBookInfo(book);
        return CommonsReturn.success("");
    }

    /*
       修改书籍信息

   * 路径： http://localhost:8082/api/book/update
   * 请求方式 post
   *
   * 参数

   * 返回值
   *
    */
    @PostMapping("update")
    public CommonsReturn update(Book book){
        bookService.updateBook(book);
        return CommonsReturn.success("");
    }
    /*
     修改书籍信息

 * 路径： http://localhost:8082/api/book/queryBookById
 * 请求方式 get
 *
 * 参数
        id
 * 返回值
 *
  */
    @GetMapping("queryBookById")
    public CommonsReturn queryBookById(Integer id){
        if(id==null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        Book book = bookService.queryBookById(id);
        return CommonsReturn.success(book);
    }
    /*
     删除书籍信息

 * 路径： http://localhost:8082/api/book/delBookById
 * 请求方式 delete
 *
 * 参数
        id
 * 返回值
 *
  */
    @DeleteMapping("delBookById")
    public CommonsReturn delBookById(Integer id){
        if(id==null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        bookService.delBookInfo(id);
        return CommonsReturn.success("");
    }


}
