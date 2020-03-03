package wechat.bean;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
@ConfigurationProperties(prefix="wechat")
@PropertySource("classpath:config/wechat.properties")
@Validated
public class WeChat {
    private Integer id;
    private Chats chats;
    private Contacts contacts;
    private Discovers discovers;
    private Me me;
    public WeChat(){}

    @Override
    public String toString() {
        return "WeChat{" +
                "id=" + id +
                ", chats=" + chats +
                ", contacts=" + contacts +
                ", discovers=" + discovers +
                ", me=" + me +
                '}';
    }

    public WeChat(Integer id, Chats chats, Contacts contacts, Discovers discovers, Me me) {
        this.id = id;
        this.chats = chats;
        this.contacts = contacts;
        this.discovers = discovers;
        this.me = me;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Chats getChats() {
        return chats;
    }

    public void setChats(Chats chats) {
        this.chats = chats;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Discovers getDiscovers() {
        return discovers;
    }

    public void setDiscovers(Discovers discovers) {
        this.discovers = discovers;
    }

    public Me getMe() {
        return me;
    }

    public void setMe(Me me) {
        this.me = me;
    }
}
