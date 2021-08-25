package org.sjl.controller;

import org.sjl.base.entity.HttpEntity;
import org.sjl.entity.TestOneEntity;
import org.sjl.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class TestMysqlOne {
    @Autowired
    TestOneService testOneService;

    @RequestMapping("hello")
    public HttpEntity<List<TestOneEntity>> hello() throws Exception {
        HttpEntity<List<TestOneEntity>> httpEntity = new HttpEntity<>();
        List<TestOneEntity> maps = testOneService.getList();
        System.out.println(maps);
//        if (true) {
//
//            throw new Exception();
//        }
        httpEntity.setData(maps);
//        httpEntity.setCode(HttpEntityUtil.ERROR_CODE);
//        httpEntity.setMessage("查询失败 ");
        return httpEntity;

    }
}
