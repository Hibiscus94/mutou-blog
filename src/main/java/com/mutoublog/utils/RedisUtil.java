package com.mutoublog.utils;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.InputStream;
import java.util.Properties;

public class RedisUtil {
    private static Logger log = LoggerFactory.getLogger(RedisUtil.class);
    private static String IP;        // ip
    private static int PORT;         // 端口
    private static String AUTH;          // 密码(原始默认是没有密码)
    private static int MAX_ACTIVE;       // 最大连接数
    private static int MAX_IDLE;          // 设置最大空闲数
    private static int MAX_WAIT;        // 最大连接时间
    private static int TIME_OUT;         // 超时时间
    private static boolean BORROW;         // 在borrow一个事例时是否提前进行validate操作

    private static JedisPool jedisPool;

    private static JdkSerializationRedisSerializer jdkSerializationRedisSerializer;

    private static Jedis jedis;

    private RedisUtil() {
    }

    static {
        if (jedisPool == null) {
            try {
                InputStream inputStream = RedisUtil.class.getResourceAsStream("/redis.properties");
                Properties properties = new Properties();
                properties.load(inputStream);
                //EXPIRE = Integer.valueOf(properties.getProperty("redis.expireTime", "3600"));
                IP = properties.getProperty("redis.ip", "127.0.0.1");
                PORT = Integer.valueOf(properties.getProperty("redis.port", "6379"));
                AUTH = properties.getProperty("redis.password");
                MAX_ACTIVE = Integer.valueOf(properties.getProperty("redis.pool.maxActive", "1024"));
                MAX_IDLE = Integer.valueOf(properties.getProperty("redis.pool.maxIdle", "200"));
                MAX_WAIT = Integer.valueOf(properties.getProperty("redis.pool.maxTime", "10000"));
                TIME_OUT = Integer.valueOf(properties.getProperty("redis.pool.timeOut", "10000"));
                BORROW = Boolean.getBoolean(properties.getProperty("redis.pool.testOnBorrow", "true"));
            } catch (Exception e) {
                log.error("redis properties init failed!");
            }
        }
    }

    //初始化redis连接
    private static synchronized void initRedis() {
        if (jedisPool == null) {
            try {
                JedisPoolConfig config = new JedisPoolConfig();
                //config.setTestOnReturn(Boolean.getBoolean(properties.getProperty("redis.pool.testOnReturn")));
                config.setMaxTotal(MAX_ACTIVE);
                config.setMaxIdle(MAX_IDLE);
                config.setMaxWaitMillis(MAX_WAIT);
                config.setTestOnBorrow(BORROW);
                jedisPool = new JedisPool(config, IP, PORT, TIME_OUT);
                log.info("JedisPool init success！");
                jdkSerializationRedisSerializer = new JdkSerializationRedisSerializer();
            } catch (Exception e) {
                log.error("JedisPool init failed!");
            }
        }
        jedis = jedisPool.getResource();
        if (!"".equals(AUTH)) {
            jedis.auth(AUTH);
        }
    }

    //默认通过缓存键获取值
    public static <T> T get(String key) {
        initRedis();
        T result;
        try {
            result = (T) jdkSerializationRedisSerializer.deserialize(jedis.get(key.getBytes()));
        } catch (Exception e) {
            result = null;
        } finally {
            close();
        }
        return result;
    }

    /**
     * 序列化存储
     *
     * @param key   key
     * @param value value
     * @param ttl   ttl
     * @return bool
     */
    public static boolean set(String key, Object value, Integer ttl) {
        try {
            initRedis();
            String code = jedis.setex(key.getBytes(), ttl, jdkSerializationRedisSerializer.serialize(value));
            if (code.equals("ok")) {
                return true;
            }
        } catch (Exception e) {
            log.info("redis set error!");
            return false;
        } finally {
            close();
        }
        return false;
    }

    /**
     * 删除缓存
     *
     * @param key key
     * @return bool
     */
    public static boolean del(String key) {
        try {
            initRedis();
            Long code = jedis.del(key.getBytes());
            if (code > 1) {
                return true;
            }
        } catch (Exception e) {
            log.info("redis del error!");
            return false;
        } finally {
            close();
        }
        return false;
    }

    public static void close() {
        if (jedis != null)
            jedis.close();
    }

    /**
     * 插入对象
     *
     * @param key key
     * @param obj obj
     * @return bool
     */
    public static boolean setObject(String key, Object obj, int expire) {
        String value = JSON.toJSONString(obj);
        try {
            initRedis();
            String code = jedis.set(key, value);
            if (expire > 0) {
                jedis.expire(key, expire);
            }
            if (code.equals("ok")) {
                return true;
            }
        } catch (Exception e) {
            log.info("redis set object error!");
            return false;
        } finally {
            close();
        }
        return false;
    }

    /**
     * 存储key~value
     *
     * @param key   key
     * @param value value
     * @return bool
     */
    public static boolean setValue(String key, String value, int expire) {
        try {
            initRedis();
            String code = jedis.set(key, value);
            if (expire > 0) {
                jedis.expire(key, expire);
            }
            if (code.equals("ok")) {
                return true;
            }
        } catch (Exception e) {
            log.info("redis set value error!");
            return false;
        } finally {
            close();
        }
        return false;
    }

    /**
     * 获取缓存String
     *
     * @param key key
     * @return String
     */
    public static String getValue(String key) {
        String result;
        try {
            initRedis();
            result = jedis.get(key);
        } catch (Exception e) {
            result = null;
        } finally {
            close();
        }
        return result;
    }
}