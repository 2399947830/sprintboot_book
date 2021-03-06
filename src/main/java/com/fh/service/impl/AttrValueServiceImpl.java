package com.fh.service.impl;

import com.fh.entity.po.AttrValue;
import com.fh.mapper.AttrValueMapper;
import com.fh.service.AttrValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AttrValueServiceImpl implements AttrValueService {

    @Autowired
    private AttrValueMapper attrValueMapper;

    @Override
    public List<AttrValue> queryAllData(Integer attId) {
        return  attrValueMapper.queryAttrValueDataVo(attId);
    }

    @Override
    public void deleteAttrValue(Integer id) {
        attrValueMapper.deleteAttrValue(id);
    }

    @Override
    public AttrValue queryAttrValueById(Integer id) {
       return attrValueMapper.queryAttrValueById(id);
    }

    @Override
    public void updateAttrValue(AttrValue attrValue) {
        attrValueMapper.updateAttrValue(attrValue);
    }

    @Override
    public void addAttrValue(AttrValue attrValue) {
        attrValueMapper.addAttrValue(attrValue);
    }
}
