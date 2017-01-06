package com.chen.designpattern.flyweight;

/**
 * 享元模式
 * 主要优点:
 * 1、减少对象内存占用
 * 2、外部状态与内部状态相对独立,从而可以复用享元对象
 * 主要缺点:
 * 1、使得系统变得复杂
 * <p>
 * 源码出现:
 * <p>
 * 1、Integer
 * Created by Chen on 2017/1/6.
 */
public class Main {
    public static void main(String[] args) {
        IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
        IgoChessman igoChessman = igoChessmanFactory.getIgoChessman("w");
        IgoChessman igoChessman1 = igoChessmanFactory.getIgoChessman("w");
        IgoChessman igoChessman2 = igoChessmanFactory.getIgoChessman("w");
        System.out.println("equel?" + (igoChessman == igoChessman1));
    }
}
