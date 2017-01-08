package com.chen.designpattern.iterator;

import java.util.ArrayList;

/**
 * Created by Chen on 2017/1/7.
 */
public abstract class List<T> {
    protected ArrayList<T> mArrayList = new ArrayList<T>();

    public void add(T obj) {
        mArrayList.add(obj);
    }

    public void remove(int index) {
        mArrayList.remove(index);
    }

    public ArrayList<T> getList() {
        return mArrayList;
    }

    public abstract Iterator createIterator();
}
