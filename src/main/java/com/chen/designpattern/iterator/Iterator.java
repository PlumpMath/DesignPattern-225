package com.chen.designpattern.iterator;

/**
 * Created by Chen on 2017/1/7.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();
}
