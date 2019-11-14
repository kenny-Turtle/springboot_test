package shiro06;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import shiro02.ShiroUtils;


/**
 * @Author zfj
 * @create 2019/8/16 13:23
 */
public class LoginLogout {
    public static void main(String[] args) {
        Subject subject= ShiroUtils.getSubject("classpath:shiro06/shiro.ini");
//        Subject subject= ShiroUtils.getSubject("classpath:shiro06/shiro.ini");
        subject.login(new UsernamePasswordToken("admin","123"));
        System.out.println("是否认证:"+subject.isAuthenticated());
    }


}
