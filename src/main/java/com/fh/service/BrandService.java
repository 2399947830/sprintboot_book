package com.fh.service;

import com.fh.entity.po.Brand;
import com.fh.entity.vo.BrandVo;

import java.util.List;
import java.util.Map;

public interface BrandService {

    Map queryAllData(BrandVo vo);

    void deleteBrand(Integer id);

    Brand queryProductById(Integer id);

    void updateProduct(Brand brand);

    void addBrand(Brand brand);

    List<Brand> queryDataByTypeId(Brand brand);
}
