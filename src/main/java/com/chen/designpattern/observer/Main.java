package com.chen.designpattern.observer;

/**
 * 观察者模式
 * 主要优点:
 * 1、解耦观察者与被观察对象
 * 2、支持广播通信
 * 3、符合开闭原则
 * 主要缺点:
 * 1、多层观察耗时
 * 2、可能导致循环
 * 3、没法知道观察者为啥变化
 * Created by Chen on 2017/1/9.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        SubjectObserver observer = new SubjectObserver();
        SubjectObserver observer1 = new SubjectObserver();
        SubjectObserver observer2 = new SubjectObserver();
        subject.addObserver(observer);
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifiy("Test");
    }
}
