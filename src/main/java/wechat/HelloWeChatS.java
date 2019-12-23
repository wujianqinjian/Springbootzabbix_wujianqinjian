package wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wechat.bean.WeChat;
import wechat.beanothertest.WeChatOther;

@SpringBootApplication
public class HelloWeChatS {
    WeChat weChat;
    WeChatOther weChatOther;

    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloWeChatS.class, args);
    }

}
