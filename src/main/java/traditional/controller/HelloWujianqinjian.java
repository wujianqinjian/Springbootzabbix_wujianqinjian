package traditional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import traditional.bean.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
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
        return "index";
            }


    @RequestMapping("/login")
    public String loginVue(){
        return "login";
    }


    @RequestMapping("/thymeleaf")
    public String testThymeleaf(Map<String,Object> map) {
        map.put("thymeOne","<h1>你好，Map返回值</h1>");
        map.put("today","17");
        map.put("listOne", Arrays.asList("new1,new2,new3"));
        return "thymeleaf";
    }


    @RequestMapping("/helloVue")
    public String testVue() {
        //map.put("helloVue","你好，Map返回值");
        return "helloVue";
    }



}
