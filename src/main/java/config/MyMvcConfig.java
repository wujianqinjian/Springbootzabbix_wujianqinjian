package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {

    //指定获取资源的路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("index").setViewName("index");
        registry.addViewController("login").setViewName("login");
        //registry.addViewController("/thymeleaf").setViewName("thymeleaf");
        registry.addViewController("/fanta").setViewName("fanta");
    }
}
