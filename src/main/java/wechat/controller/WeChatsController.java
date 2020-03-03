package wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import wechat.bean.Me;
import wechat.bean.WeChat;
import wechat.dao.ChatsDao;
import wechat.dao.MeDao;
import wechat.dao.WechatDao;

import java.util.Collection;

@Controller
public class WeChatsController {

    @Autowired
    MeDao meDao;
    @Autowired
    ChatsDao chatsDao;
    @Autowired
    WechatDao wechatDao;

    //获取所有用户
    @GetMapping("/weChats")
    public String list(Model model){
        Collection<WeChat> chatses=wechatDao.getAll();
        //model.addAllAttributes(chatses);
        model.addAttribute("weChats",chatses);
        return "weChats/list";
    }


   //跳转到添加用户页面
    @GetMapping("/weChat")
    public String toAddWeChat(Model model){
        //Collection<Me> weChatsC=meDao.getMes();

        Collection<Me> mes=meDao.getMes();
        model.addAttribute("mes",mes);

        return "weChats/add";
    }

    //添加真正的员工
    @PostMapping("/weChat")
    public String addWeChat(WeChat weChat){
        wechatDao.save(weChat);
        return "redirect:/weChats";
    }

}
