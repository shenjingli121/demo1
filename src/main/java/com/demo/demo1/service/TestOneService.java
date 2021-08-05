package com.demo.demo1.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.demo1.entity.TestOneEntity;

import java.util.List;

public interface TestOneService  {
    List<TestOneEntity> getList();
}
