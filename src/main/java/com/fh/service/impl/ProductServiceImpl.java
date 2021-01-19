package com.fh.service.impl;

import com.fh.entity.po.Product;
import com.fh.entity.vo.ProductVo;
import com.fh.mapper.ProductMapper;
import com.fh.service.ProductService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public void delteProduct(Integer id) {
        productMapper.delteProduct(id);
    }

    @Override
    public Product queryProductById(Integer id) {
        return productMapper.queryProductById(id);
    }

    @Override
    public void updateProduct(Product product) {
        product.setUpdateDate(new Date());
        productMapper.updateProduct(product);
    }

    @Override
    public void addProduct(Product product) {
        product.setAuthor("test");
        product.setIsdel(1);
        productMapper.addProduct(product);
    }

    @Override
    public Map queryProductData(ProductVo vo) {
        Map<String,Object> map = new HashMap();
        Integer count =productMapper.queryProductCount(vo);
        map.put("count",count);
        List<Product> productList = productMapper.queryProductDataVo(vo);
        map.put("list",productList);
        return map;
    }


}
