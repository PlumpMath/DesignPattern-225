package com.chen.designpattern.chain;

/**
 * 责任链模式
 * 主要优点
 * 1、客户端只负责创建责任链,链里对象只处理请求,降低系统的耦合度
 * 2、灵活性,运行时动态添加和创建
 * 3、新增具体的请求处理,无需修改原有代码
 * <p>
 * 主要缺点:
 * 1、链过长是不易调试
 * 2、容易建链出现死循环
 * 3、请求可能得不到处理
 * Created by Chen on 2017/1/7.
 */
public class Main {
    public static void main(String[] args) {
        BeiHandler handler = new BeiHandler();
        ChenHandler chenHandler = new ChenHandler();
        handler.setNextHandler(chenHandler);
        handler.handlerRequest("chen");
    }
}
