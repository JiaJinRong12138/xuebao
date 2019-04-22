package com.getTicket.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RadisMapper {

    /**
     * radis Mapper
     */
/*
    @Autowired
    private StringRedisTemplate template;


    //增加 OR 更新
    public void add(String sno, Temp_info temp_info){
        //向radis内添加数据，一天后过期
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(sno, String.valueOf(temp_info), 1, TimeUnit.DAYS);
    }

    //删除
    public void delete(String sno){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.getOperations().delete(sno);
    }
    //查找
    public String getBySno(String sno){
        ValueOperations<String, String> ops = template.opsForValue();
        return ops.get(sno);
    }*/
}
