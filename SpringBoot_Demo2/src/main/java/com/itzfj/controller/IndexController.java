package com.itzfj.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zfj
 * @create 2019/8/21 13:24
 */
@RestController
public class IndexController {

    /*@RequestMapping("/index")
    public String Show(Model model){

        model.addAttribute("name","赵四");
        return "index";
    }*/

    @RequestMapping("/page")
    public String Show(Model model){
        model.addAttribute("name","老夫子");
        return "show";

    }


}
