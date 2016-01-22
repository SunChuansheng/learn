package com.lvmama.scs.learnspring.beans;

/**
 * Created by sunchuansheng on 2016/1/11.
 */
public class ClassB {

    private ClassA a;

    public ClassB() {
    }

    public ClassB(ClassA a) {
        this.a = a;
    }

    public ClassA getA() {
        return a;
    }

    public void setA(ClassA a) {
        this.a = a;
    }
}
