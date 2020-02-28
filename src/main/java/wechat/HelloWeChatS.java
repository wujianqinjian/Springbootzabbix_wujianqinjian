package wechat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import wechat.bean.Chats;
import wechat.bean.Contacts;
import wechat.bean.WeChat;
import wechat.beanothertest.WeChatOther;
import wechat.dao.WechatDao;


@SpringBootApplication
public class HelloWeChatS {
    //wechatChats
    @Autowired
    WeChat weChat;
    WeChatOther weChatOther;
    @Autowired
    Chats chats;
    @Autowired
    Contacts contacts;
    @Autowired
    WechatDao wechatDao;

    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloWeChatS.class, args);
    }

}
