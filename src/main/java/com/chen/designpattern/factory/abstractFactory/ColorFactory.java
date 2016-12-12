package com.chen.designpattern.factory.abstractFactory;

import com.chen.designpattern.factory.base.color.Color;
import com.chen.designpattern.factory.base.color.ColorType;
import com.chen.designpattern.factory.base.color.Green;
import com.chen.designpattern.factory.base.color.Red;
import com.chen.designpattern.factory.base.shape.Shape;
import com.chen.designpattern.factory.base.shape.ShapeType;

/**
 * Created by Chen on 2016/12/12.
 */
public class ColorFactory extends AbstractFactory {
    public Color getColor(ColorType colorType) {
        switch (colorType) {
            case GREEN:
                return new Green();
            case RED:
                return new Red();
            default:
                throw new RuntimeException("unknow color");
        }
    }

    public Shape getShape(ShapeType shapeType) {
        return null;
    }
}
