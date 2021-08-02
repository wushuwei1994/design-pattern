package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcretedBuilder();
        Director director = new Director(builder);
        director.getProduct();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
    }
}
