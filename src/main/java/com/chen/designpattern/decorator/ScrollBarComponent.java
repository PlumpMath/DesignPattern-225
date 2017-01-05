package com.chen.designpattern.decorator;

/**
 * Created by Chen on 2017/1/5.
 */
public class ScrollBarComponent extends Component{
    protected Component mComponent;

    public ScrollBarComponent(Component component) {
        mComponent = component;
    }

    public void display() {
        mComponent.display();

        System.out.println("ScrollBar render");
    }
}
