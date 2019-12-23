package traditional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import traditional.bean.Person;

@RestController
public class HelloWujianqinjian {

    @Autowired
    Person person;

    @RequestMapping("/helloPersonWujianqinjian")
    public String helloWujianqinjian(){
        return "你好"+person;
    }
}
