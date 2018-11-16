package com.dido.hbsSpringExample.context.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class HbsSpringConfig {
  @Bean
  public HandlebarsViewResolver getHandlebarsViewResolver() {
    HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
    try {
      viewResolver.setPrefix(new ClassPathResource("views").getURI().toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
    viewResolver.setSuffix(".hbs");

    return viewResolver;
  }
}
