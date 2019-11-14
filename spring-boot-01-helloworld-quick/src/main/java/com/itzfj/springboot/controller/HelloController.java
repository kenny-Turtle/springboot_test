package com.itzfj.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zfj
 * @create 2019/8/28 14:27
 */
/*@ResponseBody //表示这个类的所有方法返回的的数据直接写给浏览器
@Controller*/
@RestController //前两个的合体
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    //@ResponseBody 该注解可以写在最上面
    @RequestMapping("/hello")
    public String hello(){
        return "hello"+name;
    }
}
