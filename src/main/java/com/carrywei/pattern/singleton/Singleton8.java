package com.carrywei.pattern.singleton;

/**
 * @Author wushuwei
 * @Description 单例模式实现8，枚举方式
 * @Date 2021/7/15
 **/
public enum Singleton8 {

    INSTANCE();

    Singleton8(){
        System.out.println("单例模式实现8，枚举方式");
    }

    public static void main(String[] args) {

    }
}
