package com.fh.mapper;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;

import java.util.List;

public interface AttrValueMapper {

    List<AttrValue> queryAttrValueDataVo(AttrValue attrValue);
}
