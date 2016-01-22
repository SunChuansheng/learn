package com.lvmama.scs.learnspring.service.impl;

import com.lvmama.scs.learnspring.service.LoginService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * Created by sunchuansheng on 2016/1/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-beans.xml")
public class LoginServiceImplTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void testLogin() throws Exception {
        String userName = "Scs";
        String password = "123456";

        Assert.assertTrue("登录功能异常", loginService.login(userName, password));
    }

}