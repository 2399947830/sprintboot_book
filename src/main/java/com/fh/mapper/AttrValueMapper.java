package com.fh.mapper;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AttrValueMapper {

    List<AttrValue> queryAttrValueDataVo(AttrValue attrValue);
    @Update("update shop_product_attr_value set isdel = 0 where id = #{id}")
    void deleteAttrValue(Integer id);

    @Select("select * from  shop_product_attr_value where id = #{id}")
    AttrValue queryAttrValueById(Integer id);

    @Update("update shop_product_attr_value set value=#{value},valueCH=#{valueCH},attrId=#{attrId}," +
            " isdel=#{isdel} where id = #{id}")
    void updateAttrValue(AttrValue attrValue);

    @Insert("insert into shop_product_attr_value (value,valueCH,attrId,isdel)" +
            " values (#{value},#{valueCH},#{attrId},#{isdel})")
    void addAttrValue(AttrValue attrValue);

}
