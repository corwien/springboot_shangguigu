package com.guigu.springboot.config;

import com.guigu.springboot.component.LoginHandlerInterceptor;
import com.guigu.springboot.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: kaiyi
 * @create: 2020-08-03 15:56
 */

// 使用 WebMvcConfigurerAdapter 可以来扩展SpringMVC 的功能
// @EnableWebMvc 不要接管SpringMVC

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("guigui").setViewName("success");
  }

  // WebMvcConfigurerAdapter
  @Bean // 将组件注册在容器
  public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){

    WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

      @Override
      public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("main.html").setViewName("dashboard");
      }

      // 注册拦截器
      @Override
      public void addInterceptors(InterceptorRegistry registry) {
        // super.addInterceptors(registry);
        // 静态资源，springboot已经做好了静态资源映射
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
            .excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**", "/webjars/**");
      }
    };

    return adapter;
  }

  @Bean
  public LocaleResolver localeResolver(){
    return new MyLocaleResolver();
  }
}
