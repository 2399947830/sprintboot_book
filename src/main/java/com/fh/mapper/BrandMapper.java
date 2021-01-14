package com.fh.mapper;

import com.fh.entity.po.Product;
import com.fh.entity.vo.BrandVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {


    Integer queryBrandCount(BrandVo vo);

    List<Product> queryBrandDataVo(BrandVo vo);

    @Delete("update shop_product_brand set isdel = 1")
    void deleteBrand(Integer id);
}
