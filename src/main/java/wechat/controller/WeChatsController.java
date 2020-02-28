package wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import wechat.bean.WeChat;
import wechat.crud.dao.ChatsDao;
import wechat.dao.WechatDao;

import java.util.Collection;

@Controller
public class WeChatsController {

    @Autowired
    ChatsDao chatsDao;
    @Autowired
    WechatDao wechatDao;

    //获取所有用户
    @GetMapping("/weChats")
    public String list(Model model){
        Collection<WeChat> chatses=wechatDao.getWeChats();
        //model.addAllAttributes(chatses);
        model.addAttribute("chatlist",chatses);
        return "weChats/list";
    }


   //添加用户
    @GetMapping("weChat")
    public String addWeChat(){
        return "weChats/add";

    }
}
