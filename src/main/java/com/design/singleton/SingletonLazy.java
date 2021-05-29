package com.design.singleton;

/**
 * 单例模式 之 懒汉式
 */
public class SingletonLazy {
    /**
     * 创建一个实例对象
     */
    private static SingletonLazy instance;

    /**
     * 私有化构造方法
     */
    private SingletonLazy() {}

    /**
     * 静态 get 方法
     */
    public static SingletonLazy getInstance() {
        if (null == instance) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
