package com.ee;

import org.omg.CORBA.TIMEOUT;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**  
 * @Description: RedisUtils.java
 * @author: lsm
 * @date: 2019年1月8日 下午2:07:28   
 */
public class RedisUtils {
	private static final String URL = "127.0.0.1";
	private static final int PORT = 6379;
	private static final  int TIMEOUT = 1000;
	private static JedisPool jedisPool = null;
	
	
	static{
		JedisPoolConfig config = new JedisPoolConfig();
		jedisPool = new JedisPool(config,URL, PORT, TIMEOUT);
	}
	
	public synchronized static Jedis getJedis(){
		if (jedisPool != null) {
			Jedis jedis = jedisPool.getResource();
			return jedis;
		}else {
			return null;
			
		}
	}
	
	@SuppressWarnings("deprecation")
	public synchronized static void closeJedisResource(final Jedis resource){
		if (resource != null) {
			jedisPool.returnResource(resource);
		}
		
	}

}
