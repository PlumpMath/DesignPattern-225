package com.chen.designpattern.build;

/**
 * 建造者模式
 * 1、使得客户端不需要关心Product的具体构造,产品本身与产品创建过程解耦
 * 2、每一个具体的建造者相对独立,符合开闭原则
 * <p>
 * 适用场景:
 * 1、产品本身数据字段过多,属性间相互依赖,并且需要指定生成顺序
 * 2、隔离复杂产品的创建和使用,并且相同的创建过程可以创建不同的产品
 * Created by Chen on 2017/1/4.
 */
public abstract class ListBuild {
    protected static List sList = new List();

    public abstract void buildHeader();

    public abstract void buildFooter();

    public abstract void buildContent();

    public static List build(ListBuild listBuild) {
        if (listBuild != null) {
            listBuild.buildHeader();
            listBuild.buildContent();
            listBuild.buildFooter();
            return sList;
        } else {
            return null;
        }
    }
}
