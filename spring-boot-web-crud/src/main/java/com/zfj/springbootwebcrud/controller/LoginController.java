package com.zfj.springbootwebcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import java.util.Map;

/**
 * @Author zfj
 * @create 2019/8/21 16:38
 */
@Controller
public class LoginController {

    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map){
        System.out.println(username+password);
        if(!StringUtils.isEmpty(username)&&"123".equals(password)){
            map.put("successName","<h2>张三</h2>");
            //
            return "main";
        }else{
            //
            map.put("error","用户名密码错误");
            return "login";
        }


    }

    @RequestMapping("/user/jump")
    public String jump(){
        return "regist";
    }
}
