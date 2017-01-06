package com.chen.designpattern.facade;

/**
 * Created by Chen on 2017/1/6.
 */
public class Facade {
    private SubSystemA mSubSystemA = new SubSystemA();
    private SubSystemB mSubSystemB = new SubSystemB();

    public void method() {
        mSubSystemA.methodA();
        mSubSystemB.methodB();
    }

}
