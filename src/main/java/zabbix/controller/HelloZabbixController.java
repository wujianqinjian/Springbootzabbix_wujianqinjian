package zabbix.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloZabbixController {

    @RequestMapping("/leo")
    public String hello_zabbix_m(){
        return "This is new bird!";
    }


    @RequestMapping("/leo2")
    public String hello_zabbix_m2(){
        return "This is new bird!";
    }

    @RequestMapping("/leo3")
    public String hello_zabbix_m3(){
        return "This is new bird!";
    }


}
