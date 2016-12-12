package com.chen.designpattern.factory.abstractFactory;

/**
 * Created by Chen on 2016/12/12.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else {
            throw new RuntimeException("unknoe factory");
        }

    }
}
