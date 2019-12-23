package wechat.beanothertest;



import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import wechat.bean.Chats;
import wechat.bean.Contacts;
import wechat.bean.Discovers;
import wechat.bean.Me;

import java.util.List;


@Component
@ConfigurationProperties(prefix = "wechatsplaceholder")
@Validated
public class WeChatplaceholder {
    private Chats chats;
    private Contacts contacts;
    private Discovers discovers;
    private Me me;
    private List<String> tmptest;

    @Override
    public String toString() {
        return "WeChatplaceholder{" +
                "chats=" + chats +
                ", contacts=" + contacts +
                ", discovers=" + discovers +
                ", me=" + me +
                ", tmptest=" + tmptest +
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

    public List<String> getTmptest() {
        return tmptest;
    }

    public void setTmptest(List<String> tmptest) {
        this.tmptest = tmptest;
    }
}
