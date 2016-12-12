package com.chen.designpattern.factory.abstractFactory;

/**
 * Created by Chen on 2016/12/12.
 */
public class Main {
    public static final void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
    }
}
