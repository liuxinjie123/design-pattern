package com.design.singleton;

/**
 * 单例模式 之 饿汉式
 * 线程安全
 * 静态内部类
 */
public class SingletonLazySafeFour {
    private SingletonLazySafeFour() {}

    /**
     * 此处用一个内部类来维护单例
     */
    private static class SingletonFactory {
        private static SingletonLazySafeFour instance = new SingletonLazySafeFour();
    }

    /**
     * 获取实例
     */
    private static SingletonLazySafeFour getInstance() {
        return SingletonFactory.instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     */
    public Object readResolve() {
        return getInstance();
    }
}
