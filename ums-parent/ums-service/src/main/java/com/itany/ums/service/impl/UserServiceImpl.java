package com.itany.ums.service.impl;

import com.itany.ums.dao.UserDao;
import com.itany.ums.entity.User;
import com.itany.ums.ov.UserVo;
import com.itany.ums.service.UserService;
import com.itany.ums.util.MybatisUtil;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void regist(UserVo userVo) {
        MybatisUtil.getSession().getMapper(UserDao.class);

        User user=new User();
        user.setUsername(userVo.getUsername());
        user.setPassword(userVo.getPassword());
        user.setAge(userVo.getAge());

        userDao.insert(user);
        MybatisUtil.getSession().commit();
        MybatisUtil.closeSession();

    }
}
