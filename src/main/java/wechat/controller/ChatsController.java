package wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wechat.bean.Chats;
import wechat.bean.WeChat;
import wechat.crud.dao.ChatsDao;
import wechat.dao.WechatDao;

import java.util.Collection;

@Controller
public class ChatsController {

    @Autowired
    ChatsDao chatsDao;
    @Autowired
    WechatDao wechatDao;

    @GetMapping("/wechatChats")
    public String list(Model model){
        Collection<WeChat> chatses=wechatDao.getWeChats();
        //model.addAllAttributes(chatses);
        model.addAttribute("chatlist",chatses);
        return "wechatChats/list";
    }
}
