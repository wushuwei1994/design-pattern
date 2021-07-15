package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现4，懒汉式（同步方法，线程安全）
 * @Date 2021/7/15
 **/
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {
        System.out.println("单例模式实现4，懒汉式（同步方法，线程安全）。当前线程：" + Thread.currentThread().getName());
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示懒加载-同步方法方式创建单例对象：");
//        Singleton4 instance1 = Singleton4.getInstance();
//        Singleton4 instance2 = Singleton4.getInstance();
//        System.out.println(instance1 == instance2);

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton4.getInstance();
            }).start();
        }
    }
}
