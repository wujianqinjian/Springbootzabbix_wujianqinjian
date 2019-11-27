package redis;
import redis.clients.jedis.Jedis;




public class RedisConnection {

        public static void main(String[] args) {
            testJedisConnection();
        }


    public static void testJedisConnection(){
        try {
            String host = "r-bp1iwpzmxbr0v3bxk8pd.redis.rds.aliyuncs.com";//控制台显示访问地址
            //String host="10.66.244.83";
            int port = 6379;
            Jedis jedis = new Jedis(host, port);
            //鉴权信息
            jedis.auth("Ma123456");//password
            //jedis.auth("Aa123456");
            String key = "redis2";
            String value = "aliyun-redis2";
            //select db默认为0
            jedis.select(1);
            //set一个key
            jedis.set(key, value);
            System.out.println("Set Key " + key + " Value: " + value);
            //get 设置进去的key
            String getvalue = jedis.get(key);
            System.out.println("Get Key " + key + " ReturnValue: " + getvalue);
            System.out.println("键为redis的值："+jedis.get("redis"));
            jedis.quit();
            jedis.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }




}


