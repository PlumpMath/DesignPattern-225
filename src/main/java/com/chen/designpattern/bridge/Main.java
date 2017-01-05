package com.chen.designpattern.bridge;

/**
 * 桥接模式
 * 主要优点:
 * 1、分离抽象接口以及其实现,解耦抽象接口固定的绑定关系。
 * 2、桥接模式取代多层继承关系,多层继承关系违反了单一职责原则
 * 3、桥接模式提高了系统的可扩展性,符合开闭原则
 * Created by Chen on 2017/1/5.
 */
public class Main {
    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.setImplementor(new Implementor() {
            public void operationImpl() {
                System.out.println("operantion Impl");
            }
        });
        refinedAbstraction.operation();
    }
}
