package com.fh.service;

import com.fh.entity.po.Brand;
import com.fh.entity.vo.BrandVo;

import java.util.Map;

public interface BrandService {

    Map queryAllData(BrandVo vo);

    void deleteBrand(Integer id);
}
