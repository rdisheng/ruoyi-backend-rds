package com.ruoyi.ai;

import com.ruoyi.common.core.redis.RedisCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AiTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void testChatAi() {
        System.out.println("集成测试，testChatAi");
        Set<String> keys = redisCache.getAllCache();
        keys.forEach(e -> {
            System.out.println(e);
        });
    }
}
