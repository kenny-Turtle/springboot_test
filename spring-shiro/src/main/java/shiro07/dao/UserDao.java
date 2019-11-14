package shiro07.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @Author zfj
 * @create 2019/8/16 14:15
 */
public interface UserDao {
    void insert(@Param("loginName") String loginName, @Param("password") String password);
}
