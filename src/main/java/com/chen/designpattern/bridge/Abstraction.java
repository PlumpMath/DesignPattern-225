package com.chen.designpattern.bridge;

/**
 * Created by Chen on 2017/1/5.
 */
public abstract class Abstraction {
    protected Implementor mImplementor;

    public Implementor getImplementor() {
        return mImplementor;
    }

    public void setImplementor(Implementor implementor) {
        mImplementor = implementor;
    }

    public abstract void operation();
}
