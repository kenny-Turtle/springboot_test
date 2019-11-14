package com.itany.spring;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @Author zfj
 * @create 2019/9/25 15:53
 */
public class JedisTest {

    @Test
    public void test01(){
        Jedis jedis=new Jedis("192.168.192.137",6379);
        jedis.set("name","tom");
        jedis.set("age","20");
        System.out.println(jedis.get("name"));
    }
}
