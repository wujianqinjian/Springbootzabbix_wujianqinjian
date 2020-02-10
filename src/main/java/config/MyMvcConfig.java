package config;

import Component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class MyMvcConfig  implements WebMvcConfigurer {

    //指定获取资源的路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index.html").setViewName("index");
    }

/*    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration index = registry.addInterceptor(new IndexHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("indexSuccess.html","/static/**","/", "/index.html", "/index");
    }*/

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
