package com.carrywei.pattern.builder;

/**
 * @Author wushuwei
 * @Description
 * @Date 2021/8/2
 **/
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    Product getProduct() {
        return builder.build();
    }
}
