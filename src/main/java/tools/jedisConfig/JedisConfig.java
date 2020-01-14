package tools.jedisConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;



@Configuration
public class JedisConfig {

    private Logger logger= LoggerFactory.getLogger(JedisConfig.class);

    @Value("${spring.redis.host}")
    private String host;
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
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMinIdle(minIdle);
        jedisPoolConfig.setMaxTotal(maxActive);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);
        logger.info("JedisPool 连接成功:" + host + "\t" + port);
        Jedis jedis = jedisPool().getResource();
        jedis.set("new", "one");
        String foobar = jedis.get("new");
        System.out.println(foobar);
        System.out.println(jedisPool);
        jedis.close();
        jedisPool.destroy();
        return jedisPool;



    }
    public static void main(String[] args) {
        JedisConfig jedisConfig=new JedisConfig();
        Jedis jedis= jedisConfig.jedisPool().getResource();
        String newMessage=jedis.get("new");
        System.out.println(newMessage);
    }


}
