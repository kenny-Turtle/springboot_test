package com.zfj.springbootwebcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author zfj
 * @create 2019/8/21 20:04
 */
@Controller
public class RegistController {

    @PostMapping(value = "/user/regist")
    public String regist(){

        return "main";
    }
}
