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
public class TraditionalController {

    @Autowired
    Person person;

    @RequestMapping("/thymeleaf")
    public String testThymeleaf(Map<String,Object> map) {
        map.put("thymeOne","<h1>你好，Map返回值</h1>");
        map.put("today","17");
        map.put("listOne", Arrays.asList("hi,cheney,do you boring?,hi,fanta,do you boring?"));
        return "thymeleaf";
    }

    @RequestMapping("/fanta")
    public String fanta(Map<String,Object> map) {
        map.put("fanta","<h1>Hi,Fanta,游泳、吃饭？还有啥感兴趣的？</h1>");
        return "fanta";
    }


    @RequestMapping("/login")
    public String loginM(){
        return "login";
    }

    @RequestMapping("/index")
    public String indexM(){
        return "index";
    }

}
