package com.chen.designpattern.flyweight;

/**
 * Created by Chen on 2017/1/6.
 */
public abstract class IgoChessman {
    public void display() {
        System.out.println("Color = " + getColor());
    }

    public abstract String getColor();
}
