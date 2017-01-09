package com.chen.designpattern.observer;

/**
 * Created by Chen on 2017/1/9.
 */
public class SubjectObserver implements Observer {


    public void update(Observable observer, Object object) {
        System.out.println("SubjectObserver " + object.toString());
    }
}

