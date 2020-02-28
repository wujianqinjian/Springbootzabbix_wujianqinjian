package wechat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import wechat.bean.Me;

import java.util.Map;

public class MeDao {

    private static Map<String,Me> mes=null;

    public Me getWeChats(String weChatId){
        return mes.get(weChatId);
    }
    //Me(String weChatId, String weChatNickName, String headImage,
    // String weChatPay, String favorites, String myPosts, String cardsAndOffers, String stickerGallery, String settings) {
   /* static{
        mes.put(new Me());
    }*/
}
