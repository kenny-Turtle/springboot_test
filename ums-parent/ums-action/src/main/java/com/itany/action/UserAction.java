package com.itany.action;

import com.itany.ums.ov.UserVo;
import com.itany.ums.service.UserService;
import com.itany.ums.service.impl.UserServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebService
public class UserAction extends HttpServlet {

    private UserService userService=new UserServiceImpl();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/regist.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        int age=Integer.parseInt((req.getParameter("age")));

        UserVo userVo=new UserVo();
        userVo.setUsername(username);
        userVo.setPassword(password);
        userVo.setAge(age);

        userService.regist(userVo);
        req.getRequestDispatcher("/WEB-INF/views/success.jsp").forward(req,resp);
    }
}
