package com.chen.designpattern.factory.abstractFactory;

import com.chen.designpattern.factory.base.color.Color;
import com.chen.designpattern.factory.base.color.ColorType;
import com.chen.designpattern.factory.base.shape.Rectangle;
import com.chen.designpattern.factory.base.shape.Shape;
import com.chen.designpattern.factory.base.shape.ShapeType;
import com.chen.designpattern.factory.base.shape.Square;

/**
 * Created by Chen on 2016/12/12.
 */
public class ShapeFactory extends AbstractFactory {
    public Color getColor(ColorType colorType) {
        return null;
    }

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new RuntimeException("unknow shape");
        }
    }
}
