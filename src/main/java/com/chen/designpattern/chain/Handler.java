package com.chen.designpattern.chain;

/**
 * Created by Chen on 2017/1/6.
 */
public abstract class Handler {
    protected Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract boolean isIntercept(String request);

    protected abstract void handler(String request);

    public void handlerRequest(String request) {
        if (isIntercept(request)) {
            handler(request);
        } else {
            nextHandler.handlerRequest(request);
        }
    }
}
