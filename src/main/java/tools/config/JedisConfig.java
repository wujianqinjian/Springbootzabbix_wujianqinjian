package tools.config;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


@Configuration
public class JedisConfig   {

    private Logger logger= LoggerFactory.getLogger(JedisConfig.class);

    @Value("${app.redis.host}")
    private  String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.maxActive}")
    private int maxActive;
    @Value("${spring.redis.maxIdle}")
    private int maxIdle;
    @Value("${spring.redis.minIdle}")
    private int minIdle;
    @Value("${spring.redis.timout}")
    private int timeout;
    @Value("${spring.redis.password}")
    private String password;

    @Bean
    public JedisPool jedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(11);
        jedisPoolConfig.setMinIdle(2);
        jedisPoolConfig.setMaxTotal(5);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"r-bp1iwpzmxbr0v3bxk8pd.redis.rds.aliyuncs.com", 6379, 2000, "Ma123456",2);
        logger.info("JedisPool 连接成功:" + "r-bp1iwpzmxbr0v3bxk8pd.redis.rds.aliyuncs.com" + "\t" + 6379);
        //jedisPool.destroy();
        System.out.println(host);
        System.out.println(port);
        System.out.println(password);
        System.out.println(jedisPool.toString());
        System.out.println(jedisPool);
        return jedisPool;

    }

    public static void main(String[] args) {


        JedisConfig jedisConfig=new JedisConfig();
        Jedis jedis= jedisConfig.jedisPool().getResource();
        //jedis.set("test","new");

        //String newMessage=jedis.get("new");

    }

}
