package com.fh.mapper;


import com.fh.entity.po.Product;
import com.fh.entity.vo.ProductVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ProductMapper {

    @Delete("update t_product set isdel = 0 where id = #{id}")
    void delteProduct(Integer id);

    @Select("select * from t_product where id = #{id}")
    Product queryProductById(Integer id);

    @Update("update t_product set " +
            "name=#{name},bandE=#{bandE},imgpath=#{imgpath}," +
            "bandDesc=#{bandDesc},sort=#{sort},isdel=#{isdel},updateDate=SYSDATE()" +
            " where id = #{id}")
    void updateProduct(Product product);

    @Insert("insert into t_product (name,bandE,bandDesc,sort,isdel,createDate,author)" +
            " values (#{name},#{bandE},#{bandDesc},#{sort},#{isdel},SYSDATE(),#{author})")
    void addProduct(Product product);

    Integer queryProductCount(ProductVo vo);

    List<Product> queryProductDataVo(ProductVo vo);
}
