package zabbix;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zabbix.bean.Zabbix;


@SpringBootApplication
public class HelloZabbix {

    @Autowired
    Zabbix zabbix;
    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloZabbix.class, args);

    }

}