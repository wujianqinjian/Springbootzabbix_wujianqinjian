package zabbix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZabbixConfig {

    @Bean
    public Integer getPort(){
        return 8082;
    }
}
