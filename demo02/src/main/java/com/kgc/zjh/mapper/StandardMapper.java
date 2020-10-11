package com.kgc.zjh.mapper;

import com.kgc.zjh.pojo.Standard;
import com.kgc.zjh.pojo.StandardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StandardMapper {
    int countByExample(StandardExample example);

    int deleteByExample(StandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Standard record);

    int insertSelective(Standard record);

    List<Standard> selectByExample(StandardExample example);

    Standard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Standard record, @Param("example") StandardExample example);

    int updateByExample(@Param("record") Standard record, @Param("example") StandardExample example);

    int updateByPrimaryKeySelective(Standard record);

    int updateByPrimaryKey(Standard record);

    int delPiLiang(List id);
}