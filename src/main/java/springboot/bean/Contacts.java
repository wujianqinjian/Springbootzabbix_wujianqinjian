package springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "contacts")
public class Contacts {
    private String imageUrl;
    private String nickName;

    @Override
    public String toString() {
        return "Contacts{" +
                "imageUrl='" + imageUrl + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
