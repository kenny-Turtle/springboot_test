package shiro07.service.Impl;

import org.apache.shiro.authc.credential.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import shiro07.dao.UserDao;
import shiro07.service.UserService;
import shiro07.vo.PasswordVo;

/**
 * @Author zfj
 * @create 2019/8/16 14:11
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordService passwordService;


    public void regist(String loginName, String password) {
        //对明文密码进行加密
        PasswordVo passwordVo=new PasswordVo();
        passwordVo.setPasswrod(password);
        passwordVo.setSalt(loginName);

        String encryptPassword = passwordService.encryptPassword(passwordVo);


        userDao.insert(loginName,encryptPassword);
    }
}
