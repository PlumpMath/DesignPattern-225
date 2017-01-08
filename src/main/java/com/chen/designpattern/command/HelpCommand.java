package com.chen.designpattern.command;

/**
 * Created by Chen on 2017/1/7.
 */
public class HelpCommand extends Command {
    public HelpCommand(CommandReceiver commandReceiver) {
        super(commandReceiver);
    }

    public void excute() {
        mCommandReceiver.handlerCommand();
    }
}
