package hello;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.HelloWeChatS;
import springboot.bean.WeChat;
import springboot.beanothertest.WeChatOther;
import springboot.beanothertest.WeChatplaceholder;
import zabbix.HelloZabbix;
import zabbix.bean.Zabbix;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloZabbix.class)
public class ConZabbix {

  /*  @Autowired
    WeChatplaceholder weChatplaceholder;*/
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    Zabbix zabbix;



        @Test
        public void testweChat(){
            Boolean bp=applicationContext.containsBean("getPort");
            String bps=bp.toString();
            System.out.println(bps);
            System.out.println(zabbix);
        }


  /*      @Test
        public void testweChatOther(){
            System.out.println(weChatOther);
        }

        @Test
        public void testHelloWeChat(){
            boolean b=applicationContext.containsBean("helloWeChat");
            System.out.println(b);
        }
        @Test
        public void testWeChatplaceholder(){
            System.out.println(weChatplaceholder);
        }*/



}
