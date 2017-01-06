package com.chen.designpattern.proxy;

/**
 * Created by Chen on 2017/1/6.
 */
public abstract class ProxyRequest implements Request {
    private RealRequest mRealRequest = new RealRequest();

    public abstract void willRequest();

    public abstract void didRequest();

    public void request() {

    }
}
