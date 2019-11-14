package com.zfj.springbootwebcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBootWebCrudApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootWebCrudApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
         return new myViewResolver();
    }

    private static class myViewResolver implements ViewResolver{

        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

}
