package com.chen.designpattern.singleton;

/**
 * 枚举实现单例,最好,但是很少使用。
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 */
public enum Singleton_Enum {
    INSTANCE;

    public void whateverMethod() {
    }

}