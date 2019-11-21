package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springboot.bean.WeChat;
import springboot.beanothertest.WeChatOther;

@SpringBootApplication
public class HelloWeChatS {
    WeChat weChat;
    WeChatOther weChatOther;

    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloWeChatS.class, args);
    }

}
