package com.itzfj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zfj
 * @create 2019/8/21 14:44
 */
@Controller
public class JspController {

    @RequestMapping("/indexPage")
    public String IndexPage(){
        return "index";
    }
}
