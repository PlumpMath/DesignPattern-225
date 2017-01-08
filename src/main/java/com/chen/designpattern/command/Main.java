package com.chen.designpattern.command;

/**
 * 命令行模式:
 * 主要优点:
 * 1、降低系统耦合度
 * 2、新命令很容易加入到系统中,无需修改原有代码,符合开闭原则
 * 3、比较容易设计出一个命令队列和宏命令
 * 4、为撤销和恢复撤销提供一种设计和实现方案。
 *
 * Created by Chen on 2017/1/7.
 */
public class Main {
    public static void main(String[] args) {
        HelpCommandReceiver helpCommandReceiver = new HelpCommandReceiver();
        HelpCommand helpCommand = new HelpCommand(helpCommandReceiver);
        helpCommand.excute();
    }
}
