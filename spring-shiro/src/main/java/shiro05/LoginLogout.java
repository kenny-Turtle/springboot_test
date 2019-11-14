package shiro05;

import myshiro01.MyShiroUtil;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import java.util.Arrays;

/**
 * @Author zfj
 * @create 2019/8/16 11:20
 */
public class LoginLogout {
    public static void main(String[] args) {
        Subject subject= MyShiroUtil.getSubject("classpath:shiro05/shiro.ini");
        subject.login(new UsernamePasswordToken("admin","123"));
        System.out.println("认证否："+subject.isAuthenticated());

        boolean hasRole = subject.hasRole("teacher");

        System.out.println("是否有teacher的权限:"+hasRole);

        boolean permitted = subject.isPermitted("teacher:update");
        System.out.println(permitted);

        boolean[] permitted1 = subject.isPermitted("teacher:view", "manager:view");
        System.out.println(Arrays.toString(permitted1));
    }
}
