package myshiro01;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @Author zfj
 * @create 2019/8/16 10:38
 */
public class MyShiroUtil {
    public static Subject getSubject(String path){
        //1
//        Factory<SecurityManager> factory=new IniSecurityManagerFactory(path);
//        SecurityManager securityManager=factory.getInstance();
        Factory<SecurityManager> factory= new IniSecurityManagerFactory(path);
        SecurityManager securityManager=factory.getInstance();
        //2
        SecurityUtils.setSecurityManager(securityManager);
        //3
        Subject subject=SecurityUtils.getSubject();
        return subject;


    }
}
