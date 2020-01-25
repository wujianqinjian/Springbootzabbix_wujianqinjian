package tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.config.JedisConfig;
import wechat.bean.WeChat;
import wechat.beanothertest.WeChatOther;

@SpringBootApplication
public class SpringbootRedisApplication {

    @Autowired
    JedisConfig jedisConfig;

    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(
                JedisConfig.class, args);
    }

}
