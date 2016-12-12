package com.chen.designpattern.singleton;

/**
 * 饿汉单例,通过ClassLoader机制避免了d多线程的同步问题。
 * 但是有可能其他方式导致类装载,这样就没有lazy loading了。
 */
public class Singleton_EHan {
    private static Singleton_EHan sSingletonEHan = new Singleton_EHan();

    public static Singleton_EHan getInstance() {
        return sSingletonEHan;
    }
}
