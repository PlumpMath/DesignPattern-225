package com.chen.designpattern.singleton;

/**
 * Double Check Lock
 * 双锁校验,在保证线程安全的同时,提高了效率
 */
public class Singleton_DCL {
    private volatile static Singleton_DCL sSingleton_dcl;

    public static Singleton_DCL getInstance() {
        if (sSingleton_dcl == null) {
            synchronized (Singleton_DCL.class) {
                if (sSingleton_dcl == null) {
                    sSingleton_dcl = new Singleton_DCL();
                }
            }
        }
        return sSingleton_dcl;
    }
}
