package com.chen.designpattern.bridge;

/**
 * Created by Chen on 2017/1/5.
 */
public class RefinedAbstraction extends Abstraction {
    public void operation() {
        mImplementor.operationImpl();
    }
}
