package com.chen.designpattern.build;

/**
 * Created by Chen on 2017/1/4.
 */
public class List {
    private String mHeader;
    private String mFooter;
    private String mContent;

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        mHeader = header;
    }

    public String getFooter() {
        return mFooter;
    }

    public void setFooter(String footer) {
        mFooter = footer;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }
}
