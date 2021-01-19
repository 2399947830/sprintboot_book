package com.fh.service.impl;

import com.fh.entity.po.ProductMain;
import com.fh.mapper.ProductMainMapper;
import com.fh.service.ProductMainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductMainServiceImpl implements ProductMainService {
    @Resource
    private ProductMainMapper productMainMapper;


    @Override
    public List<ProductMain> queryProductMainAllData() {
        return productMainMapper.queryProductMainAllData();
    }
}
