package sl4jTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springboot.HelloWeChatS;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWeChatS.class)
public class SpringSl4jTest {

        Logger logger=LoggerFactory.getLogger(getClass());

        @Test
        public void context(){
            logger.trace("trace日志");
            logger.debug("debug日志");
            logger.info("info日志");
            logger.warn("warn日志");
            logger.error("error日志");
        }
}
