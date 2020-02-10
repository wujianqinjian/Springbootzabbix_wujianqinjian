package wechat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value="/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            session.setAttribute("online",username);
            //return "fanta";  输入验证完成后，跳转到成功页面，为了防止表单重复提交，这里需要使用下一行重定向
            //return "chatsmessage";
            return "redirect:/chatsAdmin.html";
        }else {
            map.put("message","用户名或密码错误");
            return "login";
        }

    }
}
