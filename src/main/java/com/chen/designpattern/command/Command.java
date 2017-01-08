package com.chen.designpattern.command;

/**
 * Created by Chen on 2017/1/7.
 */
public abstract class Command {
    protected CommandReceiver mCommandReceiver;

    public Command(CommandReceiver commandReceiver) {
        mCommandReceiver = commandReceiver;
    }

    public abstract void excute();

    public CommandReceiver getCommandReceiver() {
        return mCommandReceiver;
    }

    public void setCommandReceiver(CommandReceiver commandReceiver) {
        mCommandReceiver = commandReceiver;
    }
}
