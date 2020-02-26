package wechat.bean;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


@Component
//confiugurationProperties(prefix="person")
//仅仅开启了自动配置，如果想读取到propertySource中的配置文件，
//必须ConfigurationProperties和PropertySource同时声明
@ConfigurationProperties(prefix="wechat")
@PropertySource("classpath:config/wechat.properties")
@Validated
public class WeChat {
    private Chats chats;
    private Contacts contacts;
    private Discovers discovers;
    private Me me;

    public WeChat(){}

    public WeChat(Chats chats, Contacts contacts, Discovers discovers, Me me) {
        this.chats = chats;
        this.contacts = contacts;
        this.discovers = discovers;
        this.me = me;
    }

    @Override
    public String toString() {
        return "WeChat{" +
                "chats=" + chats +"\n"+
                ", contacts=" + contacts +"\n"+
                ", discovers=" + discovers +"\n"+
                ", me=" + me+"\n" +
                '}';
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
