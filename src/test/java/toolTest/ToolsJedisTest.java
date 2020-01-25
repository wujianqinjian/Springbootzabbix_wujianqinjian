package toolTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisPool;
import tools.SpringbootRedisApplication;
import tools.config.JedisConfig;


// 此类中仍然存在bug，暂时还没有解决
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootRedisApplication.class)
public class ToolsJedisTest {

    @Autowired
    private JedisPool jedisPool;


    @Test
    public void contextLoads(){
        System.out.println(jedisPool);
    }
}
