package com.kgc.zjh.service;

import com.kgc.zjh.pojo.Standard;

import java.util.List;

public interface StandardService {

    public List<Standard> selectAll(String zhname);

    public void insert(Standard standard);

    public int delete(List id);

    public Standard selectById(int id);

    public void update(Standard standard);
}
