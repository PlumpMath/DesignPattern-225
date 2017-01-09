package com.chen.designpattern.observer;

/**
 * Created by Chen on 2017/1/9.
 */
public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifiy(Object object);
}
