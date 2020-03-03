package wechat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechat.bean.Me;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MeDao {

    private static Map<String,Me> mes=null;

    public MeDao() {
    }


    static {
        mes= new HashMap<String,Me>();
        /*mes.put("getWeChatId1",new Me("getWeChatId1"," weChatNickName1","headImage1","weChatPay1","favorites1","myPosts1","cardsAndOffers1","stickerGallery1","settings1"));
        mes.put("getWeChatId2",new Me("getWeChatId2"," weChatNickName2","headImage2","weChatPay2","favorites2","myPosts2","cardsAndOffers2","stickerGallery2","settings2"));
        *//*mes.put("getWeChatId3",new Me("getWeChatId3"," weChatNickName3","headImage3","weChatPay3","favorites3","myPosts3","cardsAndOffers3","stickerGallery3","settings3"));
        mes.put("getWeChatId4",new Me("getWeChatId4"," weChatNickName4","headImage4","weChatPay4","favorites4","myPosts4","cardsAndOffers4","stickerGallery4","settings4"));
*/
    }
    
    
    public Collection<Me> getMes(){
        return mes.values();
    }


    public Me getMe(String weChatId){
        return mes.get(weChatId);
    }
    //Me(String weChatId, String weChatNickName, String headImage,
    // String weChatPay, String favorites, String myPosts, String cardsAndOffers, String stickerGallery, String settings) {
   /* static{
        mes.put(new Me());
    }*/
}
