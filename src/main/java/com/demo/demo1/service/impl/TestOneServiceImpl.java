package com.demo.demo1.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.demo1.entity.TestOneEntity;
import com.demo.demo1.mapper.TestOneMapper;
import com.demo.demo1.service.TestOneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestOneServiceImpl extends ServiceImpl<TestOneMapper, TestOneEntity> implements TestOneService {

    public TestOneMapper getMapper() {
        return this.getBaseMapper();

    }


    @Override
    public List<TestOneEntity> getList() {
        TestOneMapper mapper = this.getMapper();
        QueryWrapper<TestOneEntity> testOneEntityQueryWrapper = new QueryWrapper<>();
        List<TestOneEntity> testOneEntities = mapper.selectList(testOneEntityQueryWrapper);
        return testOneEntities;
    }
}
