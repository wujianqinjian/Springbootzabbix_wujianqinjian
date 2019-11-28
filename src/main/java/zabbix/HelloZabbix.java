package zabbix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zabbix.bean.Zabbix;


@SpringBootApplication
public class HelloZabbix {

    Zabbix zabbix;
    //启动主程序
    public static void main(String[] args){
        SpringApplication.run(HelloZabbix.class, args);

    }

}