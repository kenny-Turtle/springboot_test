package com.itany.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * @Author zfj
 * @create 2019/8/16 15:56
 */
    @WebServlet(name = "TimeServlet",urlPatterns = "/time",loadOnStartup = 1)
public class TimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
//        super.doGet(req, resp);
        //设置刷新时间
        resp.setIntHeader("ReFresh",1);
        //中文乱码
        resp.setContentType("text/html;charset=utf-8");
        //响应页面
        PrintWriter out=resp.getWriter();
        Calendar now=Calendar.getInstance();
        TimeZone timeZone=now.getTimeZone();
        out.println("<html>");
        out.println("当前时区是:"+timeZone.getDisplayName());

        out.println("   "+timeZone.getID()+"<br>");

        out.print("当前时间："+ Calendar.getInstance().get(Calendar.YEAR)+"年");
        out.print(Calendar.getInstance().get(Calendar.MONTH)+1+"月");
        out.print(Calendar.getInstance().get(Calendar.DATE)+"日");
        out.print(" "+Calendar.getInstance().get(Calendar.HOUR)+"时");
        out.print(Calendar.getInstance().get(Calendar.MINUTE)+"分");
        out.println(Calendar.getInstance().get(Calendar.SECOND)+"秒。<br>");
        out.println("今天为本年的第"+Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)+"周");
        out.println("</html>");
    }

}
