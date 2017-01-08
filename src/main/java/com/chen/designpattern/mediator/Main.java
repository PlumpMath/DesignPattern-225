package com.chen.designpattern.mediator;

/**
 * 中介者模式
 * 主要优点:
 * 1、解耦,将网状关系解耦成星形
 * 2、减少子类的产生
 * <p>
 * 主要缺点:
 * 1、具体的中介类过多的业务逻辑,使得系统难以维护
 * <p>
 * Created by Chen on 2017/1/8.
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Text text = new Text();
        Button button = new Button();
        text.setMediator(mediator);
        button.setMediator(mediator);
        mediator.register(text);
        mediator.register(button);
        text.change();
    }
}
