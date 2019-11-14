package shiro02;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

/**
 * @Author zfj
 * @create 2019/8/18 14:48
 */
public class LoginLogout {
    public static void main(String[] args) {

        Subject subject= ShiroUtils.getSubject("classpath:shiro02/shiro.ini");
        //登录
        UsernamePasswordToken token=new UsernamePasswordToken("admin","123");
        try {
            System.out.println("是否认证："+subject.isAuthenticated());
            subject.login(token);
            System.out.println("是否认证："+subject.isAuthenticated());
        }catch(UnknownAccountException e){
            System.out.println("位置的账户。"+e.getMessage());
        }catch(IncorrectCredentialsException e){
            System.out.println("错误的密码。"+e.getMessage());
        }catch(AuthenticationException e){
            System.out.println("认证异常。"+e.getMessage());
        }
        //退出
        subject.logout();
        System.out.println("是否认证。"+subject.isAuthenticated());
    }
}
