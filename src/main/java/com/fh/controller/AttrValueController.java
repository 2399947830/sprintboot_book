package com.fh.controller;

import com.fh.entity.po.AttrValue;
import com.fh.entity.vo.AttrValueVo;
import com.fh.service.AttrValueService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/attr/value")
@CrossOrigin
public class AttrValueController {

    @Autowired
    private AttrValueService attrValueService;

    @GetMapping("/queryAllData")
    public CommonsReturn queryAllData(AttrValue attrValue){
        Map map = attrValueService.queryAllData(attrValue);
        return CommonsReturn.success(map);
    }

}
