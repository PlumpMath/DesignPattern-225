package com.chen.designpattern.adapter;

/**
 * 适配者模式
 * 主要优点:
 * 1、将目标类和适配者类充分解耦
 * 主要使用场景:
 * 1、创建重复使用的类用于没有彼此关联的类
 * Created by Chen on 2017/1/5.
 */
public class Adapter implements Target {
    private Adaptee mAdaptee = new Adaptee();

    public String request() {
        return mAdaptee.calculate();
    }
}
