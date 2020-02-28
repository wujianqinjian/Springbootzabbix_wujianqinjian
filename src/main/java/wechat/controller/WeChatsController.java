package wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import wechat.bean.Me;
import wechat.bean.WeChat;
import wechat.crud.dao.ChatsDao;
import wechat.dao.MeDao;
import wechat.dao.WechatDao;

import java.util.Collection;

@Controller
public class WeChatsController {

   /* @Autowired
    MeDao meDao;*/
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
    @PostMapping("weChat")
    public String addWeChat(WeChat weChat){
        Collection<WeChat> weChatsC=wechatDao.getWeChats();

        /*Collection<Me> mes=meDao.getWeChats();*/
        /*model.addAttribute("mes",mes);*/
        return "redirect:/weChats";
    }
}
