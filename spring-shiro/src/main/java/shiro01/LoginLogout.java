package shiro01;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @Author zfj
 * @create 2019/8/15 10:42
 * 第一次登录
 */
public class LoginLogout {
    public static void main(String[] args) {
        //1，获取securityManager,初始化ini配置文件
        Factory<SecurityManager> factory= new IniSecurityManagerFactory("classpath:shiro01/shiro.ini");
        SecurityManager securityManager=factory.getInstance();
        //2，对securityManager封装，并绑定SecurityUtils
        SecurityUtils.setSecurityManager(securityManager);
        //3,获取subject
        Subject subject = SecurityUtils.getSubject();
        //4,登录
        UsernamePasswordToken token=new UsernamePasswordToken("admin","123");
        try {
            System.out.println("是否认证："+subject.isAuthenticated());
            subject.login(token);
            System.out.println("是否认证"+subject.isAuthenticated());

        } catch (UnknownAccountException e) {
            System.out.println("未知的账户："+e.getMessage());
        }catch (IncorrectCredentialsException e) {
            System.out.println("错误的密码："+e.getMessage());
        }catch (AuthenticationException e) {
            System.out.println("认证异常："+e.getMessage());
        }
        //5，退出
        subject.logout();
        System.out.println("是否认证："+subject.isAuthenticated());


    }
}
