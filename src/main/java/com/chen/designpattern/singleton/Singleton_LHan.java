package com.chen.designpattern.singleton;

/**
 * 懒汉单例
 * 调用时实例,必须加入synchronied 锁才能保证线程同步,单加入synchronized影响效率
 */
public class Singleton_LHan {
    private static Singleton_LHan sSingleton_lhan;

    public static synchronized Singleton_LHan getInstance() {
        if (sSingleton_lhan == null) {
            sSingleton_lhan = new Singleton_LHan();
        }
        return sSingleton_lhan;
    }
}