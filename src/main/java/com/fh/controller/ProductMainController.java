package com.fh.controller;

import com.fh.entity.po.ProductMain;
import com.fh.service.ProductMainService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/productMain")
@CrossOrigin
public class ProductMainController {

    @Autowired
    private ProductMainService productMainService;

    @GetMapping("/queryProductMainAllData")
    public CommonsReturn queryProductMainAllData(){
        List<ProductMain> productMainList = productMainService.queryProductMainAllData();
        return CommonsReturn.success(productMainList);
    }
}
