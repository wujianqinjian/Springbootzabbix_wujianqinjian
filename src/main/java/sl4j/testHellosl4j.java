package sl4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class testHellosl4j {

    public static void main(String[] args) {
        Logger logger=LoggerFactory.getLogger(testHellosl4j.class);
        logger.info("hello");
        logger.debug("debug");
        logger.warn("warn");

    }
}
