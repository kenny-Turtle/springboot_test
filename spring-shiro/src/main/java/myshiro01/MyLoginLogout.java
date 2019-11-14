package myshiro01;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

/**
 * @Author zfj
 * @create 2019/8/16 10:15
 */
public class MyLoginLogout {
    public static void main(String[] args) {

        /*//1,获取SecurityManager，初始化ini
        Factory<SecurityManager> factory= new IniSecurityManagerFactory("classpath:myshiro01/shiro.ini");
        SecurityManager securityManager=factory.getInstance();
        //2封装securityManager ，绑定SecurityUtil
        SecurityUtils.setSecurityManager(securityManager);
        //3获取subject
        Subject subject=SecurityUtils.getSubject();*/

//        Subject subject=MyShiroUtil.getSubject("classpath:/myshiro01/shiro.ini");
//        Subject subject=MyShiroUtil.getSubject("classpath:/myshiro01/shiro.ini");
        Subject subject=MyShiroUtil.getSubject("classpath:myshiro01/shiro.ini");
        //4登录
        UsernamePasswordToken token=new UsernamePasswordToken("zfj","123");
        try {
            subject.login(token);
            System.out.println("是否认证"+subject.isAuthenticated());
        } catch (UnknownAccountException e) {
            System.out.println("未知的账户："+e.getMessage());
        }catch (IncorrectCredentialsException e) {
            System.out.println("错误的密码："+e.getMessage());
        }catch (AuthenticationException e) {
            System.out.println("认证异常："+e.getMessage());
        }
        //5退出
        subject.logout();
    }











}
