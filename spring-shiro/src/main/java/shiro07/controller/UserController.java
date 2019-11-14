package shiro07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import shiro07.service.UserService;

/**
 * @Author zfj
 * @create 2019/8/16 14:08
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/regist")
    public String regist(String loginName,String password){
        userService.regist(loginName,password);
        return "login";
    }
}
