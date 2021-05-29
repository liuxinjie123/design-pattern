package com.design.singleton;

/**
 * 单例模式 值 懒汉式
 * 线程安全，锁定代码块
 */
public class SingletonLazySafeTwo {
    private static SingletonLazySafeTwo instance;

    private SingletonLazySafeTwo() {}

    public static SingletonLazySafeTwo getInstance() {
        if (null == instance) {
            // 同步块，线程安全的创建实例
            synchronized (SingletonLazySafeTwo.class) {
                // 再次检查是否存在
                if (null == instance) {
                    instance = new SingletonLazySafeTwo();
                }
            }
        }
        return instance;
    }
}
