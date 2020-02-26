package wechat.dao;

import org.springframework.stereotype.Service;
import wechat.bean.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import wechat.bean.Chats;

//这里的注释需要注意一下，如果确实会  equired a bean of type 'wechat.dao.classname' that could not be found
@Service
public class WechatDao {

    public WechatDao(){}

    private static Map<Integer, WeChat> weChats=null;

    static {
        weChats=new HashMap<Integer, WeChat>();
        //public WeChat(Chats chats, Contacts contacts, Discovers discovers, Me me) {
        //public Chats(String imageUrl, String title, String newest)
        //public Contacts(String imageUrl, String nickName)
        //public Discovers(String moments, String scan, String shake, String topStories,
        //String search, String peopleNearby, String games, String miniPrograms)
        //public Me(String weChatId, String weChatNickName, String headImage, String weChatPay, String favorites, String myPosts,
        // String cardsAndOffers, String stickerGallery, String settings)
        weChats.put(1,new WeChat(new Chats("url1","title1","newtest1"),
                      new Contacts("urlC1","nickName1"),
                      new Discovers("moments1","scan1","shake1","topStories1","search1","peopleNearby1","games1","miniPrograms1"),
                      new Me("getWeChatId1"," weChatNickName1","headImage1","weChatPay1","favorites1","myPosts1","cardsAndOffers1","stickerGallery1","settings1")));
        weChats.put(2,new WeChat(new Chats("url2","title2","newtest2"),
                new Contacts("urlC2","nickName2"),
                new Discovers("moments2","scan2","shake2","topStories2","search2","peopleNearby2","games2","miniPrograms2"),
                new Me("getWeChatId2","weChatNickName2","headImage1","weChatPay2","favorites2","myPosts2","cardsAndOffers2","stickerGallery2","settings2")));

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
