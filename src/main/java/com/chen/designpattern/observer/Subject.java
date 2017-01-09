package com.chen.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by Chen on 2017/1/9.
 */
public class Subject implements Observable {
    private ArrayList<Observer> mObservers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        mObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        mObservers.remove(observer);
    }

    public void notifiy(Object object) {
        for (Observer obj : mObservers
                ) {
            obj.update(this, object);
        }
    }
}
