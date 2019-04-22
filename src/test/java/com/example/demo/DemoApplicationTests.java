package com.example.demo;

import com.getTicket.utils.Md5;
import com.getTicket.utils.StringUtil;
import com.getTicket.utils.TokenUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

        /**
         * MD5加密测试
         */
        String t = "eyJhbGciOiJSUzI1NiJ9.eyJzbm8iOiI0MTcwMDc0OSIsInN1YiI6IjQxNzAwNzQ5IiwiaWF0IjoxNTU1NjQ0MDg4LCJleHAiOjE1NTU2ODAwODh9.Zmg5_OsSG8K9gCH-CmkMvHBFa9nEEVPrww9nGjg6f-9PizLiGk2Pd5R0UxfXQUKkQMrsqCl4SciY2XibreoW5wrMP99YGKUcMhFauKlxEV5Mz_UzKdrCU-2fmMZQ__Voc92aQk1aKYnUZWOf3zCBPbcT9tPdPB9UA-Wj-DtI23UUvOC-ZVYglO4ptutmgVUlcm01s2xLCnVIIHlGDVpOm3AAC7taAwY9y0bEykuJOsFhufRZXOu3mhSvi0CD2Agcmqwhz--ywmIhWs6atf3Asr_O13PG0LgZfj6_AGE8i2quRvTniOaYYK6az2jb7lZ_EUX2Vxx6kv8xLf8JK6Kwew";
        System.out.println("【这是一个TEST方法】" + TokenUtil.getUserIdFromRequest(t));


    }

}
