package com.lvmama.scs.learnspring.dao.impl;

import com.lvmama.scs.learnspring.dao.UserDao;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    @Override
    public String getLoginPwd(String loginName) {
        if ("admin".equals(loginName)) {
            return "12345678";
        } else {
            return "123456";
        }
    }
}
