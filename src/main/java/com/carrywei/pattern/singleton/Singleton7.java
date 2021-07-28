package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现7，静态内部类
 * @Date 2021/7/15
 **/
public class Singleton7 {

    private Singleton7(){
        System.out.println("单例模式实现7静态内部类。当前线程：" + Thread.currentThread().getName());
    }

    private static class InstanceHolder{
        private static Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return InstanceHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println("开始演示静态内部类创建单例对象：");
        Singleton7 instance1 = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance1 == instance2);
    }
}
