package wechat.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import wechat.bean.Chats;
import wechat.bean.WeChat;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ChatsDao {

    private static Map<String, Chats> chatses = null;

    public ChatsDao() {
    }

    @Autowired
    Chats chats;
    @Autowired
    private WeChat weChat;

    static{
        chatses= new HashMap<String,Chats>();
        chatses.put("游泳圈里的画家",new Chats("imageUrlOne","游泳圈里的画家","再看看"));
        chatses.put("游泳练习生交流群",new Chats("imageUrltwo","游泳圈里的画家","再看看"));
        chatses.put("Aimee游泳学堂",new Chats("imageUrlthree","游泳圈里的画家","再看看"));
    }


    public Collection<Chats> getAll(){
        return chatses.values();
    }
}
