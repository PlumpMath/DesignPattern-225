package com.chen.designpattern.facade;

/**
 * 外观模式
 * 主要优点:
 * 1、客户端与子系统间松耦合
 * 2、客户端是用子系统更加简单
 * 主要缺点:
 * 1、不能直接屏蔽子系统
 * 使用场景:
 * 1、客户端与多个子系统耦合
 * 2、在层次化结构中，可以使用外观模式定义系统中每一层的入口，层与层之间不直接产生联系，
 * 而通过外观类建立联系，降低层之间的耦合度。
 * Created by Chen on 2017/1/6.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
