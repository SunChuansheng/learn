package com.lvmama.scs.learnspring.service.impl;

import com.lvmama.scs.learnspring.dao.UserDao;
import com.lvmama.scs.learnspring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean login(String name,@NotNull String password) {
        return password.equals(userDao.getLoginPwd(name));
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
