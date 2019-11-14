package shiro07.service.Impl;

import org.apache.shiro.authc.credential.PasswordService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import shiro07.vo.PasswordVo;

/**
 * @Author zfj
 * @create 2019/8/17 12:13
 */
@Service
public class PasswordServiceImpl implements PasswordService {

    @Value("${algorithmName}")
    private String algorithmName;
    @Value("${hashIterations}")
    private int hashIterations;




    public String encryptPassword(Object passwordVo) throws IllegalArgumentException {
        PasswordVo vo = (PasswordVo) passwordVo;
        return new SimpleHash(algorithmName,vo.getPasswrod(),vo.getSalt(),hashIterations).toBase64();
    }

    public boolean passwordsMatch(Object o, String s) {
        return false;
    }
}
