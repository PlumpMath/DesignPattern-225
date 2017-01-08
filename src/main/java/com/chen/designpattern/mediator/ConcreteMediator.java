package com.chen.designpattern.mediator;

import java.util.ArrayList;

/**
 * Created by Chen on 2017/1/8.
 */
public class ConcreteMediator implements Mediator {
    protected ArrayList<Component> mComponents = new ArrayList<Component>();

    public void register(Component c) {
        mComponents.add(c);
    }


    public void change(Component c) {
        for (Component component : mComponents
                ) {
            if (c != component) {
                component.update();
            }
        }
    }

}
