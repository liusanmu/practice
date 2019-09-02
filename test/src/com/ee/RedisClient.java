package com.ee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**  
 * @Description: RedisClient.java
 * @author: lsm
 * @date: 2019年1月8日 下午1:43:26   
 */
public class RedisClient {
	private Jedis jedis;
	private JedisPool jedisPool;
	private ShardedJedis shardedJedis;
	private ShardedJedisPool shardedJedisPool;
	
	
	@Before
	public void getRedisClient() {
		
		jedis = RedisUtils.getJedis();
	}
	
	@Test
	public void testString() throws Exception {
		//jedis = new Jedis("127.0.0.1", 6379);
		jedis.set("food", "orange");
		String string = jedis.get("food");
		System.out.println(string);
	}
	
	
	
	
	
	
	@Test
	public void testHash() throws Exception {
		
	}
	

}
