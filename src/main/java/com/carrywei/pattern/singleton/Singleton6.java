package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现6，懒汉式（双重检查）
 * @Date 2021/7/15
 **/
public class Singleton6 {

    private static volatile Singleton6 instance;

    private Singleton6() {
        System.out.println("单例模式实现6，懒汉式（双重检查）。当前线程：" + Thread.currentThread().getName());
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            System.out.println("尝试创建实例...");
            synchronized (Singleton6.class){
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示懒加载-双重检查方式创建单例对象：");
//        Singleton6 instance1 = Singleton6.getInstance();
//        Singleton6 instance2 = Singleton6.getInstance();
//        System.out.println(instance1 == instance2);

        for (int i = 0; i < 50; i++) {
            new Thread(() -> {
                Singleton6.getInstance();
            }).start();
        }
    }
}
