package com.chen.designpattern.composite;

/**
 * 组合模式
 * 使用场景
 * 1、通常用于树形结构 (Android 中 如ViewGroup与View)
 * Created by Chen on 2017/1/5.
 */
public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder();
        folder.add(new File());
        folder.add(new File());
        folder.add(new File());
        folder.add(new File());
        folder.remove();
    }
}

