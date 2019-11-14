package com.itany.servlet;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebService
public class HelloServlet extends HttpServlet {



    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("name","tom");
        req.getRequestDispatcher("index.jsp").forward(req,resp);

    }
}
