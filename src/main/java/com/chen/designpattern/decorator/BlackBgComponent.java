package com.chen.designpattern.decorator;

/**
 * Created by Chen on 2017/1/5.
 */
public class BlackBgComponent extends Component {
    protected Component mComponent;

    public BlackBgComponent(Component component) {
        mComponent = component;
    }

    public void display() {
        mComponent.display();
        System.out.println("Black BG render");
    }
}
