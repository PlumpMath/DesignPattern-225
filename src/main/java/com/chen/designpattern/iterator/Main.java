package com.chen.designpattern.iterator;

/**
 * Created by Chen on 2017/1/7.
 */
public class Main {
    public static void main(String[] args) {
        ProductObjectList productObjectList = new ProductObjectList();
        productObjectList.add(new String("Test1"));
        productObjectList.add(new String("Test2"));
        productObjectList.add(new String("Test3"));
        productObjectList.add(new String("Test4"));


        Iterator iterator = productObjectList.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
