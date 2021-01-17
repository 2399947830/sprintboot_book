package com.fh.service;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;

import java.util.Map;

public interface AttrValueService {
    Map queryAllData(AttrValue attrValue);

    void deleteAttrValue(Integer id);

    AttrValue queryAttrValueById(Integer id);

    void updateAttrValue(AttrValue attrValue);
}
