package shiro07.vo;

import java.io.Serializable;

/**
 * @Author zfj
 * @create 2019/8/17 12:25
 */
public class PasswordVo implements Serializable {
    private String passwrod;
    private String salt;

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
