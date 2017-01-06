package com.chen.designpattern.proxy;

/**
 * 代理模式
 * 主要优点:
 * 1、能协调调用者和被调用者,一定程度上降低耦合度
 * 2、客户端可以根据抽象接口进行编程,增加系统的灵活性和可扩展性
 * Created by Chen on 2017/1/6.
 */
public class Main {
    public static void main(String[] args) {
        ProxyRequest proxyRequest = new ProxyRequest() {
            @Override
            public void willRequest() {
                System.out.println("will Request");
            }

            @Override
            public void didRequest() {
                System.out.println("did Request");
            }
        };
    }
}
