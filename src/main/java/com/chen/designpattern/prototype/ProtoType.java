package com.chen.designpattern.prototype;

import java.io.*;

/**
 * 原型模式
 * 简化对象创建过程,扩展性较好
 * 可用于辅助实现撤销本次操作的功能
 * Created by Chen on 2017/1/4.
 */
public class ProtoType implements Cloneable, Serializable {

    private String mName;
    private Serializable mObject;

    public Serializable getObject() {
        return mObject;
    }

    public void setObject(Serializable object) {
        mObject = object;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    /**
     * 浅拷贝
     * 只复制基础类型字段,只复制值引用
     * @return
     */
    public ProtoType clone() {
        ProtoType cloneObj = null;
        try {
            cloneObj = (ProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObj;
    }

    /**
     * 深拷贝
     * 通过序列化来实现深拷贝,复制所有的字段
     * @return
     */
    public ProtoType deepClone() {
        ProtoType cloneObj = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            cloneObj = (ProtoType) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cloneObj;
    }
}
