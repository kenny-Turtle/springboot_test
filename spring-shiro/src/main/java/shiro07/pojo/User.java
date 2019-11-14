package shiro07.pojo;

import java.io.Serializable;

/**
 * @Author zfj
 * @create 2019/8/16 14:16
 */
public class User implements Serializable {
    private Integer id;
    private String loginName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
