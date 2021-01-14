package com.fh.mapper;

import com.fh.entity.po.Brand;
import com.fh.entity.po.Product;
import com.fh.entity.vo.BrandVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface BrandMapper {


    Integer queryBrandCount(BrandVo vo);

    List<Product> queryBrandDataVo(BrandVo vo);

    @Update("update shop_product_brand set isdel = 1")
    void deleteBrand(Integer id);

    @Select("select * from  shop_product_brand where id = #{id}")
    Brand queryProductById(Integer id);

    @Update("update shop_product_brand set name=#{name},nameCH=#{nameCH},typeId=#{typeId},type=#{type}," +
            "isSKU=#{isSKU},isdel=#{isdel},updateDate=SYSDATE() where id = #{id}")
    void updateProduct(Brand brand);

    @Insert("insert into shop_product_brand (name,nameCH,typeId,type,isSKU,isdel,createDate,author)" +
            " values (#{name},#{nameCH},#{typeId},#{type},#{isSKU},#{isdel},SYSDATE(),#{author})")
    void addBrand(Brand brand);
}
