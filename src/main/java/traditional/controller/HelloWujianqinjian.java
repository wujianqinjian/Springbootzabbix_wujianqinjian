package traditional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @ResponseBody
    @RequestMapping("/index")
    public String indexVue(){
        return "index.html";
            }

    @ResponseBody
    @RequestMapping("/login")
    public String loginVue(){
        return "login.html";
    }
}
