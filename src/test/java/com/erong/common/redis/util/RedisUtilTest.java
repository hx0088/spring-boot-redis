package com.erong.common.redis.util;

import com.erong.common.redis.config.FastJsonRedisSerializer;
import com.erong.common.redis.entity.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;



    @Test
    public void set() {
        RedisUtil.set("Test", "test");
    }

    @Test
    public void run() {
       if(redisTemplate != null){
           Map<String, String> map = new HashMap<>();
           map.put("asdf1", "asfd");
           map.put("asdf2", "asfd");
           map.put("asdf3", "asfd");
           map.put("asdf4", "asfd");
           redisTemplate.opsForList().leftPush("listKey", map);
           redisTemplate.opsForList().leftPush("listKey2", map);
           //Object resultMap = redisTemplate.opsForList().leftPop("listKey");
           //System.out.println(resultMap);
       }
    }

    @Test
    public void userTest(){

        redisTemplate.opsForValue().set("userDTO", new UserDto("hanxiong",  "27"));

        Object obj = redisTemplate.opsForValue().get("userDTO");
        System.out.println(obj + "================*********");

    }

}