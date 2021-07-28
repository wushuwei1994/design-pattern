package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现5，懒汉式（同步代码块，线程安全）
 * @Date 2021/7/15
 **/
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {
        System.out.println("单例模式实现5，懒汉式（同步代码块，线程安全）。当前线程：" + Thread.currentThread().getName());
    }

    public static Singleton5 getInstance() {
        synchronized (Singleton5.class) {
            if (instance == null) {
                instance = new Singleton5();
            }
        }
        return instance;
//
//
//        if (instance == null) {
//            synchronized (Singleton5.class){
//                instance = new Singleton5();
//            }
//        }
//        return instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示懒加载-同步代码块方式创建单例对象：");
//        Singleton5 instance1 = Singleton5.getInstance();
//        Singleton5 instance2 = Singleton5.getInstance();
//        System.out.println(instance1 == instance2);

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton5.getInstance();
            }).start();
        }
    }
}
