package wechat.dao;

import wechat.bean.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WechatDao {

    private static Map<Integer, WeChat> weChats=null;

    static {
        weChats=new HashMap<Integer, WeChat>();
        weChats.put(1,new WeChat());
        weChats.put(2,new WeChat());
        weChats.put(3,new WeChat());
        weChats.put(4,new WeChat());
    }

    public Collection<WeChat> getWeChats(){
        return weChats.values();
    }


    public WeChat getWeChats(Integer id){
        return weChats.get(id);
    }



/*
    new Chats(),new Contacts(),new Discovers(),new Me()
    public WeChat(Chats chats, Contacts contacts, Discovers discovers, Me me) {
        this.chats = chats;
        this.contacts = contacts;
        this.discovers = discovers;
        this.me = me;
    }*/
}
