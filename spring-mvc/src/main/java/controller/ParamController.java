package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.Map;

/**
 * @Author zfj
 * @create 2019/7/30 11:47
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse resp, HttpSession session) throws IOException {
        System.out.println("ParamController.test1,"+req+","+resp+","+session);

        String username=req.getParameter("username");
        session.setAttribute("username",username);
        PrintWriter out=resp.getWriter();
        out.print("<h1>"+username+"</h1>");
        out.flush();
        out.close();
    }

    @RequestMapping("/test2")
    public void test2(InputStream is, OutputStream os){
        //相当于如下代码
        //InputStream is=req.getInputStream();
        //OutputStream os=resp.getOutputStream();
        System.out.println("ParamController.test2,"+is+","+os);
    }
    @RequestMapping("/test3")
    public void test3(Reader reader,Writer writer){
        System.out.println("ParamController.test3."+reader+","+writer);
    }

    @RequestMapping("/test4")
    public String test4(Model model, Map map, ModelMap modelMap){
        model.addAttribute("name","tom");
        map.put("age",20);
        modelMap.addAttribute("sex","man");
        modelMap.put("address","nanjing");
        return "result";
    }

    @RequestMapping("/test5")
    public String test5(String username,int age,Double height){
        System.out.println("ParamController.test5.username:"+username+",age:"+age+",height"+height);
        return "result";
    }




}
