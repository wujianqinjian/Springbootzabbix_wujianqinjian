package wechat.bean;



import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "chats")
public class Chats {

    @Getter @Setter private String imageUrl;
    @Getter @Setter private String title;
    @Getter @Setter private String newest;


    @Override
    public String toString() {
        return "Chats{" +
                "imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", newest='" + newest + '\'' +
                '}';
    }
/*
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewest() {
        return newest;
    }

    public void setNewest(String newest) {
        this.newest = newest;
    }*/
}
