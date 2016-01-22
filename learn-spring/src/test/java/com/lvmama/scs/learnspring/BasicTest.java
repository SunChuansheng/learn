package com.lvmama.scs.learnspring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class BasicTest {

    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext-beans.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
