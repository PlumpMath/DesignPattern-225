package com.chen.designpattern.adapter;

/**
 * Created by Chen on 2017/1/5.
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        System.out.println(target.request());
    }
}
