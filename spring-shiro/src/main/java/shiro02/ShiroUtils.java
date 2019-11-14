package shiro02;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @Author zfj
 * @create 2019/8/18 14:42
 */
public class ShiroUtils {
    public static Subject getSubject(String iniPath){
        //1获取securityManager，指定配置文件
        Factory<SecurityManager> factory=new IniSecurityManagerFactory(iniPath);
        SecurityManager securityManager=factory.getInstance();
        //2封装securityManager，绑定给SecurityUtil
        SecurityUtils.setSecurityManager(securityManager);
        //3获取subject
        Subject subject=SecurityUtils.getSubject();
        return subject;
    }
}
