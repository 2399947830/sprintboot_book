package com.fh.mapper;

import com.fh.entity.po.ProductMain;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMainMapper {
    @Select("select * from shop_product_main ")
    List<ProductMain> queryProductMainAllData();
}
