package com.design.singleton;

/**
 * 单例模式 值 饿汉式
 * 线程安全，锁定代码块，
 * volatile 防止指令重排
 */
public class SingletonLazySafeThree {
    private static SingletonLazySafeThree instance;

    private SingletonLazySafeThree() {}

    public static SingletonLazySafeThree getInstance() {
        if (null == instance) {
            synchronized (SingletonLazySafeThree.class) {
                if (null == instance) {
                    instance = new SingletonLazySafeThree();
                }
            }
        }
        return instance;
    }
}
