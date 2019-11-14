package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zfj
 * @create 2019/7/30 9:32
 */
@Controller
public class LoginController {

    @RequestMapping("/showLogin")
    public ModelAndView showLogin(){
        System.out.println("LoginController.showLogin");
        ModelAndView mav=new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView login(String username,String password){
        ModelAndView mav=new ModelAndView();
        if("admin".equals(username)&&"123".equals(password)){
            mav.addObject("username",username);
            mav.setViewName("success");
        }else{
            mav.addObject("loginError","用户名登陆失败");
            mav.setViewName("login");
        }
        return mav;
    }
}
