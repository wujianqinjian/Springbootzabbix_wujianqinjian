package springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "me")
public class Me {
    private String weChatNickName;
    private String getWeChatId;
    private String weChatPay;
    private String favorites;
    private String myPosts;
    private String cardsAndOffers;
    private String stickerGallery;
    private String settings;

    @Override
    public String toString() {
        return "Me{" +
                "weChatNickName='" + weChatNickName + '\'' +
                ", getWeChatId='" + getWeChatId + '\'' +
                ", weChatPay='" + weChatPay + '\'' +
                ", favorites='" + favorites + '\'' +
                ", myPosts='" + myPosts + '\'' +
                ", cardsAndOffers='" + cardsAndOffers + '\'' +
                ", stickerGallery='" + stickerGallery + '\'' +
                ", settings='" + settings + '\'' +
                '}';
    }

    public String getWeChatNickName() {
        return weChatNickName;
    }

    public void setWeChatNickName(String weChatNickName) {
        this.weChatNickName = weChatNickName;
    }

    public String getGetWeChatId() {
        return getWeChatId;
    }

    public void setGetWeChatId(String getWeChatId) {
        this.getWeChatId = getWeChatId;
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
