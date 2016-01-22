package com.lvmama.scs.learnspring.beans;

/**
 * Created by sunchuansheng on 2016/1/11.
 */
public class ClassA {

    private ClassB b;

    public ClassA() {
    }

    public ClassA(ClassB b) {
        this.b = b;
    }

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }
}
