package com.fh.mapper;

import com.fh.entity.po.Type;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TypeMapper {

    @Select("select * from pms_type")
    List<Type> queryTypeAll();

}
