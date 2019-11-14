package com.itzfj.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zfj
 * @create 2019/8/21 11:18
 */
@EnableAutoConfiguration//启用自动配置
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String first(){
        return "Hello My first Demo";
    }
    //入口
    public static void main(String[] args) {
        SpringApplication.run(IndexController.class,args);
    }
}
