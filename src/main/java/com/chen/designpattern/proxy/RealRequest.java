package com.chen.designpattern.proxy;

/**
 * Created by Chen on 2017/1/6.
 */

public class RealRequest implements Request {
    public void request() {
        System.out.println("RealRequest");
    }
}
