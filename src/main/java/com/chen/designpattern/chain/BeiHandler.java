package com.chen.designpattern.chain;

/**
 * Created by Chen on 2017/1/7.
 */
public class BeiHandler extends Handler {
    public boolean isIntercept(String request) {
        return "bei".equals(request);
    }

    public void handler(String request) {
        System.out.println("Bei Handler " + request);
    }
}
