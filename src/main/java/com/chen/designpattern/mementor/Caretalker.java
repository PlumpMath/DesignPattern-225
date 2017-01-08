package com.chen.designpattern.mementor;

import java.util.Stack;

/**
 * Created by Chen on 2017/1/8.
 */
public class Caretalker {
    private Stack<Mementor> mMementorStack = new Stack<Mementor>();

    public void push(Mementor mementor) {
        mMementorStack.add(mementor);
    }

    public Mementor pop() {
        return mMementorStack.pop();
    }
}
