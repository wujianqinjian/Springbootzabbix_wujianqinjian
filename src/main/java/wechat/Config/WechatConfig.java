package wechat.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import Component.MyLocalResolver;


//标识改类是一个配置类，可用来替换配置文件
//Springboot 2.0 以后通过实现WebMvcConfigurer来完成印象，而不再使用WebMvcAdapter
@Configuration
public class WechatConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/chatsAdmin").setViewName("chatsmessage");
        //下面这两个似乎没有啥作用
        registry.addViewController("/weChats").setViewName("list");
        registry.addViewController("/weChat").setViewName("add");
        //registry.addViewController("/wechat").setViewName("list");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }



/*
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new IndexHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/chatsmessage","/chatsmessage.html","/static/**","/","/login.html","/login");
    }
*/

    /*    @RequestMapping("/testHelloWeChat")
    @Bean
    public HelloWeChat helloWeChat(){
        return  new HelloWeChat();
    }*/




}
