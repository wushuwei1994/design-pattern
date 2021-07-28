package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现3，懒汉式（常规写法，线程不安全）
 * @Date 2021/7/15
 **/
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
        System.out.println("单例模式实现3，懒汉式（常规写法，线程不安全）。当前线程：" + Thread.currentThread().getName());
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示常规懒加载方式创建单例对象：");
//        Singleton3 instance1 = Singleton3.getInstance();
//        Singleton3 instance2 = Singleton3.getInstance();
//        System.out.println(instance1 == instance2);

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton3.getInstance();
            }).start();
        }
    }
}
