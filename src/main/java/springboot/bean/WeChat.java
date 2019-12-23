package springboot.bean;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Component
@ConfigurationProperties(prefix = "wechat")
@Validated
public class WeChat {
    private Chats chats;
    private Contacts contacts;
    private Discovers discovers;

    private Me me;


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
