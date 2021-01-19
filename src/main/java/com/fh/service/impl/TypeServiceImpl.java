package com.fh.service.impl;

import com.fh.entity.po.Type;
import com.fh.mapper.TypeMapper;
import com.fh.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;


    @Override
    public List<Type> queryTypeAll() {
        return typeMapper.queryTypeAll();
    }
}
