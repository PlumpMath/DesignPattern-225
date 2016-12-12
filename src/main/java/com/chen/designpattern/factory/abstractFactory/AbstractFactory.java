package com.chen.designpattern.factory.abstractFactory;

import com.chen.designpattern.factory.base.color.Color;
import com.chen.designpattern.factory.base.color.ColorType;
import com.chen.designpattern.factory.base.shape.Shape;
import com.chen.designpattern.factory.base.shape.ShapeType;

/**
 * Created by Chen on 2016/12/12.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);

    public abstract Shape getShape(ShapeType shapeType);
}
