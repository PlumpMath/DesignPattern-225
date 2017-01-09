package com.chen.designpattern.strategy;

/**
 * 策略模式
 * 主要优点:
 * 1、符合开闭原则
 * 2、避免了多重判断
 * 3、策略复用
 * <p>
 * 主要缺点:
 * 1、策略类可能过多,导致系统开销
 * 2、无法同时使用多个策略类。(折上折?)
 * 3、客户端必须知道所有的策略类,根据情况使用哪种策略
 * <p>
 * Created by Chen on 2017/1/9.
 */
public class Main {
    public static void main(String[] args) {
        MoviceTicket ticket = new MoviceTicket();
        ticket.setPrice(100);
        ticket.setDiscount(new ChildrenDisCount());
        System.out.println(ticket.getPrice());
    }
}
