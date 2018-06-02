package com.erong.common.redis.controller;

import com.erong.common.redis.util.RedisUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @RequestMapping("/set")
    public String set(){
        //RedisUtil.set("han", "xiong");
        RedisUtil.set("han", "ddddddd");

        return RedisUtil.get("han");
    }

}
