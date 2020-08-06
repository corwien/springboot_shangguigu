package com.guigu.springboot.component;


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 可以在连接上携带区域信息
 *
 * @author: kaiyi
 * @create: 2020-08-03 17:43
 */
public class MyLocaleResolver implements LocaleResolver {

  @Override
  public Locale resolveLocale(HttpServletRequest request){
    String l = request.getParameter("l");

    // 如果参数上没带区域信息，就用操作系统自带的，否则就用参数上带的
    Locale locale = Locale.getDefault();
    if(!StringUtils.isEmpty(l)){
      String[] split = l.split("_");
      locale = new Locale(split[0], split[1]);

    }

    return locale;

  }

  @Override
  public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

  }

}
