package com.chen.designpattern.command;

/**
 * Created by Chen on 2017/1/7.
 */
public class HelpCommandReceiver extends CommandReceiver {

    public void handlerCommand() {
        System.out.println("Help Command Receiver");
    }
}
