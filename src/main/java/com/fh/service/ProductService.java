package com.fh.service;

import com.fh.entity.po.Product;
import com.fh.entity.vo.ProductVo;

import java.util.List;
import java.util.Map;

public interface ProductService {

    void delteProduct(Integer id);

    Product queryProductById(Integer id);

    void updateProduct(Product product);

    void addProduct(Product product);

    Map queryProductData(ProductVo vo);
}
