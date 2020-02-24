package wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import wechat.bean.Chats;
import wechat.crud.dao.ChatsDao;

import java.util.Collection;

@Controller
public class ChatsController {

    @Autowired
    ChatsDao chatsDao;

    @GetMapping("/wechatChats")
    public String list(Model model){
        Collection<Chats> chatses=chatsDao.getAll();
        model.addAllAttributes(chatses);
        return "wechatChats/list";
    }
}
