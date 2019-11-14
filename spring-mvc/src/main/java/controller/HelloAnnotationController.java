package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author zfj
 * @create 2019/7/30 9:00
 */
@Controller
public class HelloAnnotationController {

    @RequestMapping("/hello")
    public ModelAndView sayHello(String name){

        ModelAndView mav=new ModelAndView();
        mav.addObject("mag","你好"+name);
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/hello2")
    public ModelAndView sayHello2(String name){

        ModelAndView mav=new ModelAndView();
        mav.addObject("mag","您好"+name);
        mav.setViewName("hello");
        return mav;
    }
}
