package traditional.config;

import Component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import traditional.Component.IndexHandlerInterceptor;


//@EnableWebMvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }

    //这里有人说需要排除webjars，有人说static，自己排除的static后暂时无异常
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new IndexHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("fanta.html","indexSuccess.html","/static/**","/","/index.html","/index");
    }

      @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/fanta1").setViewName("index");
        registry.addViewController("/indexSuccess.html").setViewName("fanta");
        registry.addViewController("/index.html").setViewName("index");
    }
}
