package com.chen.designpattern.composite;

/**
 * Created by Chen on 2017/1/5.
 */
public interface FolderInterface {
    void add(AbstractFile file);
    void remove(AbstractFile file);
}
