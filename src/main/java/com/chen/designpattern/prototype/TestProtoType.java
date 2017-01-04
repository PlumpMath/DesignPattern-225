package com.chen.designpattern.prototype;

/**
 * Created by Chen on 2017/1/4.
 */
public class TestProtoType {
    public static void main(String[] args) {
        ProtoType type = new ProtoType();
        type.setName("type1");
        type.setObject(new TestDeepClone());

        ProtoType clone1 = type.clone();
        System.out.println(clone1 == type);
        System.out.println(clone1.getObject() == type.getObject());
        System.out.println("----------------");

        ProtoType clone2 = type.deepClone();
        System.out.println(clone2 == type);
        System.out.println(clone2.getObject() == type.getObject());
    }
}
