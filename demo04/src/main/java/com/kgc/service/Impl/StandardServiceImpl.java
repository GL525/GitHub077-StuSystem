package com.kgc.zjh.service.Impl;

import com.kgc.zjh.mapper.StandardMapper;
import com.kgc.zjh.pojo.Standard;
import com.kgc.zjh.pojo.StandardExample;
import com.kgc.zjh.service.StandardService;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("standardservice")
public class StandardServiceImpl implements StandardService {

    @Resource
    StandardMapper standardMapper;

    @Override
    public List<Standard> selectAll(String zhname) {
        StandardExample example=new StandardExample();
        StandardExample.Criteria criteria = example.createCriteria();
        if(zhname==null){
            return standardMapper.selectByExample(null);
        }else {
            criteria.andZhnameLike("%"+zhname+"%");
        }
        return standardMapper.selectByExample(example);
    }

    @Override
    public void insert(Standard standard) {
        standardMapper.insert(standard);
    }

    @Override
    public int delete(List id) {
        return standardMapper.delPiLiang(id);
    }

    @Override
    public Standard selectById(int id) {
        return standardMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Standard standard) {
        standardMapper.updateByPrimaryKeySelective(standard);
    }
}
