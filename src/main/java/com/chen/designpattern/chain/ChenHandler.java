package com.chen.designpattern.chain;

/**
 * Created by Chen on 2017/1/7.
 */
public class ChenHandler extends Handler {
    public boolean isIntercept(String request) {
        return "chen".equals(request);
    }

    public void handler(String request) {
        System.out.println("chenhandler " + request);
    }
}
