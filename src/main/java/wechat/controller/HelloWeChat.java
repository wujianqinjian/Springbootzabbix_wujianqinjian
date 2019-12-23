package wechat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wechat.bean.WeChat;

import java.lang.reflect.Method;

@RestController
public class HelloWeChat {

    @Value("${wechatName}")
    private String  wechatName;
    @Autowired
    WeChat weChat;


 /*   @Value("${wxtestmessage}")
    private String wxtestmessage;*/


//    }
/*
    @RequestMapping("/wxtestmessage")
    public String wxtestmessage() {
        return wxtestmessage;
    }*/
    @RequestMapping("/helloWechat")
    public String sayHello() throws Exception {
        Logger logger=LoggerFactory.getLogger(getClass());
        /*logger.info((String) weChat.getClass().getMethod("toString",String.class).invoke(weChat));
         */
        System.out.println("-----------------------------------------------------");
        System.out.println(weChat.getClass().getMethod("toString").invoke(weChat));
        System.out.println("-----------------------------------------------------");
        return "您好" +"\n"+ wechatName+"\n" + "欢迎你"+ "\n"+weChat;
    }

}
