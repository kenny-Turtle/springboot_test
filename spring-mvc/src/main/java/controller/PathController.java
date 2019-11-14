package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zfj
 * @create 2019/7/30 10:41
 */
@Controller
@RequestMapping("/path")
public class PathController {
    @RequestMapping("/showlogin")
    public String showLogin(){
        System.out.println("PathController.showLogin");
        return "login";
    }
}
