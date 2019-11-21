package springboot.beanothertest;




import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import springboot.bean.Chats;
import springboot.bean.Contacts;
import springboot.bean.Discovers;
import springboot.bean.Me;

import java.util.List;


@PropertySource(value = ("classpath:application-atest.properties"))
@Component
@ConfigurationProperties(prefix = "wechats")
@Validated
public class WeChatOther {
    private Chats chats;
    private Contacts contacts;
    private Discovers discovers;
    private Me me;
    private List<String> tmptest;


    @Override
    public String toString() {
        return "WeChatOther{" +
                "chats=" + chats +
                ", contacts=" + contacts +
                ", discovers=" + discovers +
                ", me=" + me +
                ", tmptest=" + tmptest +
                '}';
    }

    public List<String> getTmptest() {
        return tmptest;
    }

    public void setTmptest(List<String> tmptest) {
        this.tmptest = tmptest;
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
