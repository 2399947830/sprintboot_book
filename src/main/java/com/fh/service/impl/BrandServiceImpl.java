package com.fh.service.impl;

import com.fh.entity.po.Brand;
import com.fh.entity.po.Product;
import com.fh.entity.vo.BrandVo;
import com.fh.mapper.BrandMapper;
import com.fh.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;


    @Override
    public Map queryAllData(BrandVo vo) {
        Map<String,Object> map = new HashMap<>();
        Integer count =brandMapper.queryBrandCount(vo);
        map.put("count",count);
        List<Product> productList = brandMapper.queryBrandDataVo(vo);
        map.put("list",productList);
        return map;
    }

    @Override
    public void deleteBrand(Integer id) {
        brandMapper.deleteBrand(id);
    }

    @Override
    public Brand queryProductById(Integer id) {
        return brandMapper.queryProductById(id);
    }

    @Override
    public void updateProduct(Brand brand) {
        brandMapper.updateProduct(brand);
    }

    @Override
    public void addBrand(Brand brand) {
        brand.setAuthor("test");
        brandMapper.addBrand(brand);
    }

    @Override
    public List<Brand> queryDataByTypeId(Brand brand) {
        return brandMapper.queryDataByTypeId(brand);
    }

}
