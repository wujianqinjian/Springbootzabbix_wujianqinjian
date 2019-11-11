package hello;

//  import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;



import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import zabbix.controller.HelloZabbixController;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloZabbixController.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class HelloControllerIT {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Before
    public void setUp() throws Exception{
        this.base=new URL("http://localhost:"+port+"/leo");

    }

    @Test
    public void getHello() throws  Exception{
        ResponseEntity<String> responseEntity=testRestTemplate.getForEntity(base.toString(), String.class );
        //assertThat(responseEntity.getBody(), equalTo("Greetings from Spring Boot!"));
        //上面的方法是官网的，但是不知道为什么没有通过，下面是在博客里找的
        assertThat(responseEntity.getBody()).isEqualTo("This is new bird!");

    }

}
