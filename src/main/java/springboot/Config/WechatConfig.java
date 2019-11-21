package springboot.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springboot.controller.HelloWeChat;


//标识改类是一个配置类，可用来替换配置文件
@Configuration
public class WechatConfig {

/*    @RequestMapping("/testHelloWeChat")
    @Bean
    public HelloWeChat helloWeChat(){
        return  new HelloWeChat();
    }*/
}
