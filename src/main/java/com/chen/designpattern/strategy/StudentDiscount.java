package com.chen.designpattern.strategy;

/**
 * Created by Chen on 2017/1/9.
 */
public class StudentDiscount implements Discount {
    public double discount(double discount) {
        return discount * 0.8;
    }
}
