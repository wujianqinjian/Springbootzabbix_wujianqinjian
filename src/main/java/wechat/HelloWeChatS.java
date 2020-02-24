package wechat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wechat.bean.Chats;
import wechat.bean.WeChat;
import wechat.beanothertest.WeChatOther;


@SpringBootApplication
public class HelloWeChatS {
    @Autowired
    WeChat weChat;
    WeChatOther weChatOther;
    @Autowired
    Chats chats;

    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloWeChatS.class, args);
    }

}
