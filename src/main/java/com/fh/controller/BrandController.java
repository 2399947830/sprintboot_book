package com.fh.controller;

import com.fh.entity.po.Brand;
import com.fh.entity.vo.BrandVo;
import com.fh.entity.vo.ProductVo;
import com.fh.service.BrandService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @GetMapping("/queryAllData")
    public CommonsReturn queryAllData(BrandVo vo){
        if (vo.getCurrPage() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        if (vo.getSize() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        Map map = brandService.queryAllData(vo);
        return CommonsReturn.success(map);
    }

    @DeleteMapping("/deleteBrand")
    public CommonsReturn deleteBrand(Integer id){
        brandService.deleteBrand(id);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }


}
