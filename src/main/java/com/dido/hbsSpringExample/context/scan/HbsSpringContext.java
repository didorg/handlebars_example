package com.dido.hbsSpringExample.context.scan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
public class HbsSpringContext extends WebMvcConfigurerAdapter {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry
        .addResourceHandler("/images/**",
            "/css/**",
            "/js/**")
        .addResourceLocations("classpath:/META-INF/resources/",
            "classpath:/static/images/",
            "classpath:/static/css/",
            "classpath:/static/js/");
  }


}
