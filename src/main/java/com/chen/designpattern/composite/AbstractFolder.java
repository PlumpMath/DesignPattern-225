package com.chen.designpattern.composite;

import java.util.ArrayList;

/**
 * Created by Chen on 2017/1/5.
 */
public abstract class AbstractFolder extends AbstractFile implements FolderInterface {

    protected ArrayList<AbstractFile> mFiles = new ArrayList<AbstractFile>();

    public void add(AbstractFile file) {
        mFiles.add(file);
    }

    public void remove(AbstractFile file) {
        mFiles.remove(file);
    }
}
