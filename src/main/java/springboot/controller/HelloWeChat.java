package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.bean.WeChat;

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
    @RequestMapping("/wxhello")
    public String sayHello() {
        return "您好" + wechatName + "欢迎你"+ weChat;
    }

}
