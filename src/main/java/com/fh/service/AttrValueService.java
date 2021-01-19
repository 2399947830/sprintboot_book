package com.fh.service;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;

import java.util.List;
import java.util.Map;

public interface AttrValueService {

    List<AttrValue> queryAllData(Integer attId);

    void deleteAttrValue(Integer id);

    AttrValue queryAttrValueById(Integer id);

    void updateAttrValue(AttrValue attrValue);

    void addAttrValue(AttrValue attrValue);
}
