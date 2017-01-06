package com.chen.designpattern.flyweight;

import java.util.Hashtable;

/**
 * Created by Chen on 2017/1/6.
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory sInstance;

    private Hashtable<String, IgoChessman> mHashtable;

    public IgoChessmanFactory() {
        mHashtable = new Hashtable<String, IgoChessman>();
        mHashtable.put("w", new WriteIgoChessman());
        mHashtable.put("b", new BlackIgoChesssman());
    }

    public IgoChessman getIgoChessman(String color) {
        return mHashtable.get(color);
    }

    public static IgoChessmanFactory getInstance() {
        if (sInstance == null) {
            sInstance = new IgoChessmanFactory();
        }
        return sInstance;
    }

}
