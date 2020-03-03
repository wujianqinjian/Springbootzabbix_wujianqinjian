package wechat.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "me")
public class Me {
    private String weChatId;
    private String weChatNickName;
    private String headImage;
    private String weChatPay;
    private String favorites;
    private String myPosts;
    private String cardsAndOffers;
    private String stickerGallery;
    private String settings;

    public Me(){}

    public Me(String weChatId, String weChatNickName, String headImage) {
        this.weChatId = weChatId;
        this.weChatNickName = weChatNickName;
        this.headImage = headImage;
    }



         @Override
    public String toString() {
        return "Me{" +
                "weChatId='" + weChatId + '\'' +
                ", weChatNickName='" + weChatNickName + '\'' +
                ", headImage='" + headImage + '\'' +
                ", weChatPay='" + weChatPay + '\'' +
                ", favorites='" + favorites + '\'' +
                ", myPosts='" + myPosts + '\'' +
                ", cardsAndOffers='" + cardsAndOffers + '\'' +
                ", stickerGallery='" + stickerGallery + '\'' +
                ", settings='" + settings + '\'' +
                '}';
    }

    public Me(String weChatId, String weChatNickName, String headImage, String weChatPay, String favorites, String myPosts, String cardsAndOffers, String stickerGallery, String settings) {
        this.weChatId = weChatId;
        this.weChatNickName = weChatNickName;
        this.headImage = headImage;
        this.weChatPay = weChatPay;
        this.favorites = favorites;
        this.myPosts = myPosts;
        this.cardsAndOffers = cardsAndOffers;
        this.stickerGallery = stickerGallery;
        this.settings = settings;
    }

    public String getWeChatId() {
        return weChatId;
    }

    public void setWeChatId(String weChatId) {
        this.weChatId = weChatId;
    }

    public String getWeChatNickName() {
        return weChatNickName;
    }

    public void setWeChatNickName(String weChatNickName) {
        this.weChatNickName = weChatNickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public String getWeChatPay() {
        return weChatPay;
    }

    public void setWeChatPay(String weChatPay) {
        this.weChatPay = weChatPay;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    public String getMyPosts() {
        return myPosts;
    }

    public void setMyPosts(String myPosts) {
        this.myPosts = myPosts;
    }

    public String getCardsAndOffers() {
        return cardsAndOffers;
    }

    public void setCardsAndOffers(String cardsAndOffers) {
        this.cardsAndOffers = cardsAndOffers;
    }

    public String getStickerGallery() {
        return stickerGallery;
    }

    public void setStickerGallery(String stickerGallery) {
        this.stickerGallery = stickerGallery;
    }

    public String getSettings() {
        return settings;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }
}
