package com.chen.designpattern.factory.baseFactory;

import com.chen.designpattern.factory.base.shape.Rectangle;
import com.chen.designpattern.factory.base.shape.Shape;
import com.chen.designpattern.factory.base.shape.ShapeType;
import com.chen.designpattern.factory.base.shape.Square;

/**
 * Created by Chen on 2016/12/12.
 */
public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new RuntimeException("unknown Shapetype");
        }
    }
}
