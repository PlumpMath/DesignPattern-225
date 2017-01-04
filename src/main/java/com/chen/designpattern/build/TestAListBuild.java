package com.chen.designpattern.build;

/**
 * Created by Chen on 2017/1/4.
 */
public class TestAListBuild extends ListBuild {
    public void buildHeader() {
        System.out.println("TestA buildHeader");
        sList.setHeader("TestA");
    }

    public void buildFooter() {
        System.out.println("TestA buildFooter");
        sList.setFooter("TestA");
    }

    public void buildContent() {
        System.out.println("TestA buildContent");
        sList.setContent("TestA");
    }
}
