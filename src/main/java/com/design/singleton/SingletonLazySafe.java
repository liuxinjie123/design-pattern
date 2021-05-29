package com.design.singleton;

/**
 * 单例模式 值 懒汉式
 * 线程安全， 锁整个方法
 */
public class SingletonLazySafe {
    private static SingletonLazySafe instance;

    private SingletonLazySafe() {}

    public static synchronized SingletonLazySafe getInstance() {
        if (null == instance) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}

