package com.chen.designpattern.mementor;

/**
 * Created by Chen on 2017/1/8.
 */
public class Originator {
    private String mState;

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public void restoreMementor(Mementor mementor) {
        this.mState = mementor.getState();
    }

    public Mementor saveMementor() {
        Mementor mementor = new Mementor();
        mementor.setState(this.getState());
        return mementor;
    }

}

class Mementor {
    private String mState;

    protected String getState() {
        return mState;
    }

    protected void setState(String state) {
        mState = state;
    }
}
