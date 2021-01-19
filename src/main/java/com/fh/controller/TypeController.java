package com.fh.controller;

import com.fh.entity.po.Type;
import com.fh.service.TypeService;
import com.fh.utlis.result.CommonsReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/type")
@CrossOrigin
public class TypeController {

    @Autowired
    private TypeService typeService;

    @GetMapping("/queryTypeAll")
    public CommonsReturn queryTypeAll(){
        List<Type> typeList =typeService.queryTypeAll();
        return CommonsReturn.success(typeList);
    }
}
