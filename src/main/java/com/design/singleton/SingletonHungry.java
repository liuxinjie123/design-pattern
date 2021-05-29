package com.design.singleton;

/**
 * 单例模式 之 饿汉式
 */
public class SingletonHungry {
    /**
     * 创建一个实例对象
     */
    private static SingletonHungry instance = new SingletonHungry();

    /**
     * 私有化构造方法
     */
    private SingletonHungry(){}

    /**
     * 静态 get 方法
     */
    public static SingletonHungry getInstance() {
        return instance;
    }
}

