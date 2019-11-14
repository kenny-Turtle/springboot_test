package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zfj
 * @create 2019/7/30 10:20
 */
@Controller
public class ReturnController {

    @RequestMapping("/showLogin2")
    public String showLogin(){
        return "login";
    }

    @RequestMapping("/login2")
    public String login2(String username, String password, Model model){
        if("admin".equals(username)&&"123".equals(password)){
            model.addAttribute("username",username);
            return "success";
        }else{
            model.addAttribute("loginError","username or password error");
            return "login";
        }
    }
}
