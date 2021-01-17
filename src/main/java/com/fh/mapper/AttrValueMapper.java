package com.fh.mapper;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AttrValueMapper {

    List<AttrValue> queryAttrValueDataVo(AttrValue attrValue);
    @Update("update shop_product_attr_value set isdel = 1")
    void deleteAttrValue(Integer id);
}
