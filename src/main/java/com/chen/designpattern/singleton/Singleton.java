package com.chen.designpattern.singleton;

/**
 * Created by Chen on 16/10/8.
 */
public class Singleton {

    public static final void main(String[] args) {
        Singleton_EHan.getInstance();
        Singleton_LHan.getInstance();
        Singleton_DCL.getInstance();
        Singleton_InnerClass.getInstance();
        Singleton_Enum.INSTANCE.whateverMethod();
    }
}