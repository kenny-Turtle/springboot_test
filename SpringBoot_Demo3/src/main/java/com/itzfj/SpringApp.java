package com.itzfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zfj
 * @create 2019/8/21 14:52
 */
@SpringBootApplication(scanBasePackages = "com.itzfj.controller")
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class,args);
    }
}
