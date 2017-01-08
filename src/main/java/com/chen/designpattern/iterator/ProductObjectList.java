package com.chen.designpattern.iterator;

/**
 * 迭代器模式
 * 主要优点:
 * 1、增加新的遍历方法无需修改原来代码,符合开闭原则
 * 2、简化了聚合类
 * 3、支持多种遍历方式
 *
 * 主要缺点:
 * 1、增加系统复杂度
 * 2、抽象迭代器复杂,系统考虑以后的扩展
 *
 * 使用场景:
 * 1、不暴露聚合类的内部表示
 * 2、为一个聚合类多种遍历方式
 * 3、为多个聚合类统一迭代遍历接口
 * Created by Chen on 2017/1/7.
 */
public class ProductObjectList extends List {

    public Iterator createIterator() {
        return new ProductObjectListIterator();
    }

    private class ProductObjectListIterator implements Iterator {
        private int cursor = -1;

        public boolean hasNext() {
            return mArrayList.size() != 0 && cursor < (mArrayList.size() - 1);
        }

        public Object next() {
            cursor++;
            if (cursor >= mArrayList.size()) {
                return null;
            } else {
                return mArrayList.get(cursor);
            }
        }
    }
}
