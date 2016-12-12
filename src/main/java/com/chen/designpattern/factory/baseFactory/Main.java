package com.chen.designpattern.factory.baseFactory;

import com.chen.designpattern.factory.base.shape.ShapeType;

/**
 * Created by Chen on 2016/12/12.
 */
public class Main {
    public static final void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape(ShapeType.RECTANGLE);
        shapeFactory.getShape(ShapeType.SQUARE);
    }
}
