package com.fh.controller;

import com.fh.entity.po.Product;
import com.fh.entity.vo.ProductVo;
import com.fh.service.ProductService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/queryProductData")
    public CommonsReturn queryProductData(ProductVo vo){
        if (vo.getCurrPage() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        if (vo.getSize() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        Map map = productService.queryProductData(vo);
        return CommonsReturn.success(map);
    }

    @DeleteMapping("/delteProduct")
    public CommonsReturn delteProduct(Integer id){
        productService.delteProduct(id);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @GetMapping("/queryProductById")
    public CommonsReturn queryProductById(Integer id){
        Product product =productService.queryProductById(id);
        return CommonsReturn.success(product);
    }

    @PostMapping("/updateProduct")
    public CommonsReturn updateProduct(Product product){
        productService.updateProduct(product);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @PostMapping("/addProduct")
    public CommonsReturn addProduct(Product product){
        productService.addProduct(product);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }


}
