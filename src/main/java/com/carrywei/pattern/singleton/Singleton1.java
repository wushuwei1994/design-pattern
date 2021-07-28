package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现1，饿汉式（静态常量）
 * @Date 2021/7/15
 **/
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    private Singleton1() {
        System.out.println("单例模式实现1，饿汉式（静态常量）");
    }

    public static void main(String[] args) {
        System.out.println("开始演示静态常量方式创建单例对象：");
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
    }
}
