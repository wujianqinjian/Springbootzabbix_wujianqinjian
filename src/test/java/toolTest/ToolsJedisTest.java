package toolTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.JedisPool;


@SpringBootTest
public class ToolsJedisTest {

    @Autowired
    private JedisPool jedisPool;


    @Test
    public void contextLoads(){
        System.out.println(jedisPool);
    }
}
