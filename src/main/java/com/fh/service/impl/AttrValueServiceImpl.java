package com.fh.service.impl;

import com.fh.entity.po.AttrValue;
import com.fh.entity.po.Product;
import com.fh.entity.vo.AttrValueVo;
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
    public Map queryAllData(AttrValue attrValue) {
        Map<String,Object> map = new HashMap<>();
        List<AttrValue> attrValueList = attrValueMapper.queryAttrValueDataVo(attrValue);
        map.put("list",attrValueList);
        return map;
    }

    @Override
    public void deleteAttrValue(Integer id) {
        attrValueMapper.deleteAttrValue(id);
    }
}
