package com.lvmama.scs.learnspring.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by sunchuansheng on 2016/1/11.
 */
public class ClassATest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-beans.xml");
        ClassA classA = context.getBean("classA", ClassA.class);
        System.out.println(classA.getB().getClass().getName());
    }
}