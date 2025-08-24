package com.ruoyi.ai;

import com.ruoyi.common.core.redis.RedisCache;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class AiTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void testChatAi() {
        System.out.println("集成测试，testChatAi");
        Map<String, Object> map = redisCache.getAllCache();
        map.forEach((key, value) -> {
            System.out.println("key = " + key + ", value = " + value);
        });
    }
}
