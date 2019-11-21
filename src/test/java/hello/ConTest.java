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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWeChatS.class)
public class ConTest {

    @Autowired
    WeChat weChat;
    @Autowired
    WeChatOther weChatOther;
    @Autowired
    WeChatplaceholder weChatplaceholder;
    @Autowired
    ApplicationContext applicationContext;

        @Test
        public void testweChat(){
            System.out.println(weChat);
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
