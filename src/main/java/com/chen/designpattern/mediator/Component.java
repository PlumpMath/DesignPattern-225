package com.chen.designpattern.mediator;

/**
 * Created by Chen on 2017/1/8.
 */
public abstract class Component {
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    protected Mediator mMediator;

    public Mediator getMediator() {
        return mMediator;
    }

    protected abstract void update();

    public void change() {
        if (mMediator != null) {
            mMediator.change(this);
        }
    }
}
