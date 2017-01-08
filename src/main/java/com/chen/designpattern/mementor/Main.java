package com.chen.designpattern.mementor;

/**
 * 备忘录模式
 * 主要优点:
 * 1、提供一种状态恢复方案
 * 2、备忘录不会被其他改动,采用容器可以实现多次撤销
 *
 * 主要缺点:
 * 1、资源消耗大,如果原发器有多个状态,并且多个状态资源消耗大。
 * Created by Chen on 2017/1/8.
 */
public class Main {
    public static void main(String[] args) {
        Caretalker caretalker = new Caretalker();
        Originator originator = new Originator();
        originator.setState("Test1");
        caretalker.push(originator.saveMementor());
        originator.setState("Test2");
        caretalker.push(originator.saveMementor());
        originator.restoreMementor(caretalker.pop());
        System.out.println("1、" + originator.getState());
        originator.restoreMementor(caretalker.pop());
        System.out.println("2、" + originator.getState());
    }
}
