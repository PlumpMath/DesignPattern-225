package com.chen.designpattern.mediator;

/**
 * Created by Chen on 2017/1/8.
 */
public interface Mediator {
    void change(Component c);

    void register(Component c);
}
