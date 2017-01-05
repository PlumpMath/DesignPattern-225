package com.chen.designpattern.composite;

/**
 * Created by Chen on 2017/1/5.
 */
public class Folder extends AbstractFolder {
    public void remove() {
        for (AbstractFile file : mFiles) {
            file.remove();
        }
        System.out.println("Folder remove");
    }
}
