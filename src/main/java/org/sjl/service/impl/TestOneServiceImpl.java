package org.sjl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.sjl.entity.TestOneEntity;
import org.sjl.mapper.TestOneMapper;
import org.sjl.service.TestOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestOneServiceImpl extends ServiceImpl<TestOneMapper, TestOneEntity> implements TestOneService {

    public TestOneMapper getMapper() {
        return this.getBaseMapper();

    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<TestOneEntity> getList() {
//        redisTemplate.opsForValue().set("test", "11111");
//        String test = redisTemplate.opsForValue().get("test").toString();
//        redisTemplate.delete("test");
//        String test2 = redisTemplate.opsForValue().get("test").toString();
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+test2);


        TestOneMapper mapper = this.getMapper();
        QueryWrapper<TestOneEntity> testOneEntityQueryWrapper = new QueryWrapper<>();
        List<TestOneEntity> testOneEntities = mapper.selectList(testOneEntityQueryWrapper);
        return testOneEntities;
    }
}
