package com.fh.controller;

import com.fh.entity.po.AttrValue;
import com.fh.entity.po.Brand;
import com.fh.entity.vo.AttrValueVo;
import com.fh.service.AttrValueService;
import com.fh.utlis.result.CommonsReturn;
import com.fh.utlis.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/deleteAttrValue")
    public CommonsReturn deleteAttrValue(Integer id){
        attrValueService.deleteAttrValue(id);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @GetMapping("/queryAttrValueById")
    public CommonsReturn queryAttrValueById(Integer id){
        AttrValue attrValue =attrValueService.queryAttrValueById(id);
        return CommonsReturn.success(attrValue);
    }

    @PostMapping("/updateAttrValue")
    public CommonsReturn updateAttrValue(AttrValue attrValue){
        attrValueService.updateAttrValue(attrValue);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }


    @PostMapping("/addAttrValue")
    public CommonsReturn addAttrValue(AttrValue attrValue){
        attrValueService.addAttrValue(attrValue);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

}
