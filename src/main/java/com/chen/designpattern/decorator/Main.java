package com.chen.designpattern.decorator;

/**
 * 装饰模式
 * 主要优点:
 * 1、比继承更加的灵活,不会导致子类暴增
 * 2、对一个对象进行不同组合的装饰,可以产生不同的效果
 * 3、具体控件类和装饰类可以独立变化,无需改变,符合开闭原则
 * <p>
 * 主要缺点:
 * 1、会导致很多小装饰对象,影响性能
 * 2、灵活导致更容易出错,排错困难
 * <p>
 * 主要适用场景:
 * 1、在不改变原有对象的前提下,为单个对象增加能力职责
 * 2、无法继承实现的时候,比如Java中的final
 * Created by Chen on 2017/1/5.
 */
public class Main {
    public static void main(String[] args) {
        Component component = new Window();
        ScrollBarComponent scrollBarComponent = new ScrollBarComponent(component);
        BlackBgComponent blackBgComponent = new BlackBgComponent(scrollBarComponent);
        blackBgComponent.display();
    }
}
