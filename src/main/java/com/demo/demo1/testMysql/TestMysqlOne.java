package com.demo.demo1.testMysql;

import com.demo.demo1.entity.TestOneEntity;
import com.demo.demo1.service.TestOneService;
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
    public List<TestOneEntity> hello() {

        List<TestOneEntity> maps = testOneService.getList();
        System.out.println(maps);
        return maps;
    }
}
