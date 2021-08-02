package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public class ConcretedBuilder implements Builder {
    @Override
    public void builtPartA() {
        System.out.println("具体构造A部分");
    }

    @Override
    public void builtPartB() {
        System.out.println("具体构造B部分");
    }

    @Override
    public void builtPartC() {
        System.out.println("具体构造C部分");
    }
}
