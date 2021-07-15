package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现2，饿汉式（静态代码块）
 * @Date 2021/7/15
 **/
public class Singleton2 {

    static {
        instance = new Singleton2();
    }

    private static Singleton2 instance;

    private Singleton2() {
        System.out.println("单例模式实现2，饿汉式（静态代码块）");
    }

    public static Singleton2 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示静态代码块方式创建单例对象：");
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }
}
