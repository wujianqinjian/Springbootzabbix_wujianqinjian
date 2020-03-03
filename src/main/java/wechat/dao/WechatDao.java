package wechat.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wechat.bean.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import wechat.bean.Chats;

import javax.sound.midi.Soundbank;

//这里的注释需要注意一下，如果确实会  equired a bean of type 'wechat.dao.classname' that could not be found
@Service
public class WechatDao {


    @Autowired
    private MeDao meDao;
    @Autowired
    private Me me;
    @Autowired
    private WeChat weChat;

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
        weChats.put(1,new WeChat(1,new Chats("url1","title1","newtest1"),
                      new Contacts("urlC1","nickName1"),
                      new Discovers("moments1","scan1","shake1","topStories1","search1","peopleNearby1","games1","miniPrograms1"),
                      new Me("getWeChatId1"," weChatNickName1","headImage1","weChatPay1","favorites1","myPosts1","cardsAndOffers1","stickerGallery1","settings1")));
        weChats.put(2,new WeChat(2,new Chats("url2","title2","newtest2"),
                new Contacts("urlC2","nickName2"),
                new Discovers("moments2","scan2","shake2","topStories2","search2","peopleNearby2","games2","miniPrograms2"),
                new Me("getWeChatId2","weChatNickName2","headImage1","weChatPay2","favorites2","myPosts2","cardsAndOffers2","stickerGallery2","settings2")));
        /*weChats.put(3,new WeChat(new Chats("url3","title3","newtest3"),
                new Contacts("urlC3","nickName3"),
                new Discovers("moments3","scan3","shake3","topStories3","search3","peopleNearby3","games3","miniPrograms3"),
                new Me("getWeChatId3","weChatNickName3","headImage1","weChatPay3","favorites3","myPosts3","cardsAndOffers3","stickerGallery3","settings3")));
        weChats.put(4,new WeChat(new Chats("url4","title4","newtest4"),
                new Contacts("urlC4","nickName4"),
                new Discovers("moments4","scan4","shake4","topStories4","search4","peopleNearby4","games4","miniPrograms4"),
                new Me("getWeChatId4","weChatNickName4","headImage1","weChatPay4","favorites4","myPosts4","cardsAndOffers4","stickerGallery4","settings4")));
        weChats.put(5,new WeChat(new Chats("url5","title5","newtest5"),
                new Contacts("urlC5","nickName5"),
                new Discovers("moments5","scan5","shake5","topStories5","search5","peopleNearby5","games5","miniPrograms5"),
                new Me("getWeChatId5","weChatNickName5","headImage1","weChatPay5","favorites5","myPosts5","cardsAndOffers5","stickerGallery5","settings5")));
*/    }

    private static Integer initID=3;


    //添加新用户
    public void save(WeChat weChat){
        if(weChat.getId() == null){
            weChat.setId(initID++);


        }
        //weChat.getMe().setWeChatNickName(weChat.getMe().getWeChatNickName());

        weChats.put(weChat.getId(),weChat);
        }


    public Collection<WeChat> getAll(){
        return weChats.values();
    }

    public WeChat getWeChats(String weChatId){
        return weChats.get(weChatId);
    }

}
