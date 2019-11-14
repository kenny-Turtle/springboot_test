package Interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author zfj
 * @create 2019/7/30 16:47
 */
public class HelloInterceptor implements HandlerInterceptor{
    private long startTime,endTime;
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        startTime = System.currentTimeMillis();
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        endTime= System.currentTimeMillis();
        HandlerMethod handlerMethod= (HandlerMethod) handler;
        System.out.println("执行目标方法"+handlerMethod.getMethod().getName()+"花费的时间"+(endTime-startTime));
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
